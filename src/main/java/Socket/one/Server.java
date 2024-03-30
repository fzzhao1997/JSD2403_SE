package Socket.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    private ServerSocket serverSocket;//相当于客户中心的总机

    public Server() {
        try {
            System.out.println("正在启动服务端");
            serverSocket = new ServerSocket(8088);
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
                Runnable hander = new ClientHander(socket);
                Thread t = new Thread(hander);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
    private class ClientHander implements Runnable{
        private Socket socket;
        private  String ip;
        private String nickName;
        public ClientHander(Socket socket){
            this.socket = socket;
            this.ip = socket.getInetAddress().getHostAddress();
        }
        @Override
        public void run() {
            try {
                InputStream input = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(input, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                nickName = br.readLine();
                String message;
                while ((message = br.readLine()) != null) {
                    System.out.println(nickName+"["+ip+"]说:"+message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
