package work.seven;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;

    public Client() {
        try {
            System.out.println("正在与服务器连接...");
            socket = new Socket("localhost",8088);
            System.out.println("与服务器成功链接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            OutputStream inputStream = socket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(inputStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter,true);
            Scanner sc = new Scanner(System.in);
            System.out.println("开始聊天吧!");
            while (true) {
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
                socket.close();
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
