package Socket.one;

import jdbc.DBUtil;
import jdbc.InputUtil;
import jdbc.User;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private ServerSocket serverSocket;//相当于客户中心的总机
    private ExecutorService threadPool;
    //    private List<PrintWriter> allout = new ArrayList<>();
    private Map<String, PrintWriter> allout = new HashMap<>();

    public Server() {
        try {
            System.out.println("正在启动服务端");
            serverSocket = new ServerSocket(8088);
            threadPool = Executors.newFixedThreadPool(30);
            System.out.println("服务端启动完毕");
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    //客端端与服务端建立连接三次握手,断开连接,四次挥手
    public void start() {
        try {
            while (true) {
                System.out.println("等待客户端连接");
                Socket socket = serverSocket.accept();//阻塞方法
                System.out.println("一个客户端连接了" + socket.getInetAddress().getHostAddress());//获取所连接的客户机地址
                Runnable hander = new ClientHander(socket);//不断的创建了新的ClientHander
                threadPool.execute(hander);
//                Thread t = new Thread(hander);//反复有新线程执行
//                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    private class ClientHander implements Runnable {
        private Socket socket;
        private String ip;
        private String nickName;

        public ClientHander(Socket socket) {
            this.socket = socket;
            this.ip = socket.getInetAddress().getHostAddress();
        }

        @Override
        public void run() {
            PrintWriter pw = null;
            try {
                InputStream input = socket.getInputStream();//接到的插口转流
                InputStreamReader isr = new InputStreamReader(input, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                OutputStream output = socket.getOutputStream();
                OutputStreamWriter osr = new OutputStreamWriter(output, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osr);
                pw = new PrintWriter(bw, true);
                nickName = br.readLine();
                synchronized (allout) {//锁集合,集合唯一,
                    // 而ClientHander每次循环都会创建新对象,每线程看到的ClientHander一样
                    //实际开发中抢谁锁谁
//                    allout.(pw);//将客户端的输出流存入共享集合中
                    allout.put(nickName, pw);
                }
                sendMessage(nickName + "上线了,当前在线人数:" + allout.size());//整体拼接为String类型传参
                String message;
                while ((message = br.readLine()) != null) {
                    if (message.startsWith("@")) {
                        sendMessageToSomeOne(message);
                    } else {
                        sendMessage(nickName + "[" + ip + "]说:" + message);
                        saveMessage(nickName, null, message);
                    }
                }
            } catch (IOException e) {
//                e.printStackTrace();
                //可以添加处理客户端异常断开的操作
            } finally {
                //处理客户端断开链接后的操作(只要跳出上面的while循环必删除)
                synchronized (allout) {
                    allout.remove(nickName);
                }
                //补充删除后在线人数
                sendMessage(nickName + "下线了,当前人数:" + allout.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        //将消息发给所有客户端
        public void sendMessage(String message) {
            System.out.println(message);//发给服务端控制台
            synchronized (allout) {//锁同一个对象,与增删形成互斥,
                // 因为新循环实际是迭代器,迭代器在遍历时不能对集合增删,否则报错
//                for (PrintWriter p : allout) {//发给所有客户端
//                    p.println(message);
//                }
                for (PrintWriter p : allout.values()) {//得到输出流的集合
                    p.println(message);
                }
            }
        }

        private void sendMessageToSomeOne(String message) {
            String regex = "@.+:.+";
            //进行私聊格式验证
            if (message.matches(regex)) {
                String toNickName = message.substring(1, message.indexOf(":"));
                if (allout.containsKey(toNickName)) {
                    String content = message.substring(message.indexOf(":") + 1);
                    allout.get(toNickName).println(nickName + "悄悄对你说:" + content);
                    saveMessage(nickName, toNickName, content);
                } else {
                    allout.get(nickName).println("用户[" + toNickName + "]不存在");
                }
            } else {
                allout.get(nickName).println("私聊格式不对,应该是@对方昵称:聊天消息");
            }
        }

        /**
         * @param fromUser 谁发的消息
         * @param toUser   发送给谁
         * @param content  消息内容
         */
        private void saveMessage(String fromUser, String toUser, String content) {
            try {
                Connection connection = DBUtil.getConnection();
                String sql = "insert into chatinfo (content,from_user,to_user) " +
                        "values(?,?,?)";
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, content);
                ps.setString(2, fromUser);
                ps.setString(3, toUser);
                int d = ps.executeUpdate();
                if (d > 0) {
                    System.out.println("插入成功,共插入" + d + "条");
                } else {
                    System.out.println("插入失败");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
