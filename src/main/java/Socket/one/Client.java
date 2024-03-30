package Socket.one;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//FileOutputStream BufferedOutputStream OutputStreamWriter BufferedWriter PrintWriter ObjectOutputStream
/*
 * 聊天室客户端*/
public class Client {
    /*Socket封装了TCP协议的通讯细节*/
    private Socket socket;

    public Client() {
        try {
            socket = new Socket("176.55.11.26", 8088);//本机的ip和设置的端口,localhost是本机ip的引用
            System.out.println("与服务器成功链接!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*客户机开始工作*/
    public void start() {
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter ow = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(ow);
            PrintWriter pw = new PrintWriter(bw, true);
            Scanner sc = new Scanner(System.in);
            String nickName = "";
            while (true){
                System.out.println("请输入昵称");
                nickName = sc.nextLine();
                if(nickName.trim().length()>0){
                    pw.println(nickName);
                    break;
                }
            }
            while (true) {
                String str = sc.nextLine();
                pw.println(str);
                if (str.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();//初始化客户端
        client.start();//调start,客户端开始工作
    }
}
