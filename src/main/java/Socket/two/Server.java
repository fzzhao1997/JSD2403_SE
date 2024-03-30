package Socket.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    private ServerSocket serverSocket;

    public Server() {
        try {
            System.out.println("服务端启动...");
            serverSocket = new ServerSocket(8088);//用来启动服务器确认端口
            System.out.println("服务端启动完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        while (true) {
            try {
                Socket socket = serverSocket.accept();//接收客户端的请求,并连接,阻塞方法
                Thread thread = new Thread(() -> {
                    try {
                        InputStream inputStream = socket.getInputStream();//socket插口接收的数据转流来读取
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        String str;
                        while ((str = bufferedReader.readLine()) != null) {//读取直到为null,客户机exit后继续读取就是空,循环停止
                            System.out.println(str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
