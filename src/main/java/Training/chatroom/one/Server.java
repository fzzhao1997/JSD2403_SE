package Training.chatroom.one;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Server {
    //服务端插口
    private ServerSocket serverSocket;
    private List<PrintWriter> allOut = new ArrayList<>();

    //服务端构造
    public Server() {
        start();
        work();
    }

    //服务端启动
    public void start() {
        //设置端口等待服务端连接
        try {
            System.out.println("服务端启动....");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端等待客户端连接....");
        } catch (IOException e) {
            System.out.println("服务端启动失败...");
        }
    }

    //服务端工作
    public void work() {
        while (true) {
            //服务端接收客户端连接(serverSocket插口转socket插口)
            try {
                Socket socket = serverSocket.accept();
                System.out.println("服务端连接成功...");
                Thread t = new Thread(new ClientHander(socket));
                t.start();
            } catch (IOException e) {
                System.out.println("服务端连接失败...");
            }

        }
    }

    private class ClientHander implements Runnable {
        private Socket socket;
        private String nickName;
        private String ip;

        public ClientHander(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            String line;
            //socket插口转输入流
            try {
                //socket插口转输入流
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                //socket插口转输出流
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osr = new OutputStreamWriter(os, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osr);
                PrintWriter pw = new PrintWriter(bw, true);
                //服务端读取数据
                nickName = br.readLine();
                //pw输出流加入allOut列表
                allOut.add(pw);
                ip = socket.getInetAddress().getHostAddress();
                while ((line = br.readLine()) != null) {
                    System.out.println(nickName + "[" + ip + "]说:" + line);
                    //遍历allOut列表,并逐个输出
                    for (PrintWriter p : allOut) {
                      p.println (nickName + "[" + ip + "]说:" + line);
                    }
                }
            } catch (IOException e) {
                System.out.println("socket插口转输入流失败...");
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();//创建服务端
    }
}
