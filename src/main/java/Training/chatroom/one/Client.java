package Training.chatroom.one;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    //客户端插口
    private Socket socket;


    //客户端构造
    public Client() {
        start();
        work();
    }

    //客户端启动
    public void start() {
        try {
            System.out.println("客户端启动...");
            socket = new Socket("localhost", 8088);
            System.out.println("客户端与服务端连接成功....");
        } catch (IOException e) {
            System.out.println("客户端连接失败...");
        }
    }

    //客户端工作
    public void work() {
        ////socket插口转输出流
        try {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osr = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osr);
            PrintWriter pw = new PrintWriter(bw, true);
            Scanner sc = new Scanner(System.in);
            String nickName = "";
            //输入用户名
            while (true) {
                System.out.println("请输入用户名:");
                nickName = sc.nextLine();
                if (nickName.trim().length() > 0) {
                    pw.println(nickName);
                    break;
                }
            }
            //聊天之前就要能接收信息(不需多次创建新线程,因为客户端不像服务端不停接收发给其他人,客户端只为客户一人服务)
            Thread t = new Thread(new ServerHander());
            t.setDaemon(true);
            t.start();
            //输入聊天内容
            System.out.println("开始聊天吧...");
            String line;
            while (true) {
                line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            System.out.println("socket转输出流失败...");
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("socket关闭失败...");
            }
        }
    }
private class ServerHander implements Runnable{
    @Override
    public void run() {
        //socket插口转输入流
        try {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("socket插口转输入流失败");
        }
    }
}
    public static void main(String[] args) {
        Client client = new Client();//创建客户端
    }
}
