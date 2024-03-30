package Socket.two;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;

    public Client() {
        try {
            System.out.println("客户端启动...");
            socket = new Socket("localhost",8088);//发出请求向客户端连接,三握手
            System.out.println("客户端成功链接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            OutputStream outputStream = socket.getOutputStream();//插口转流来输出
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter,true);
            Scanner sc = new Scanner(System.in);
            System.out.println("开始聊天吧");
            while (true){
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("exit")){
                    break;
                }
                printWriter.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();//四挥手
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
