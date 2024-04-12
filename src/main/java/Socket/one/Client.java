package Socket.one;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//FileOutputStream BufferedOutputStream OutputStreamWriter BufferedWriter PrintWriter ObjectOutputStream
/*
 * 聊天室客户端*/
public class Client {
    /*Socket封装了TCP协议的通讯细节*/
    private Socket socket;

    public Client() {
        try {
            socket = new Socket("localhost", 8088);//本机的ip和设置的端口,localhost是本机ip的引用
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
            while (true) {
                System.out.println("请输入昵称");
                nickName = sc.nextLine();
                if (nickName.trim().length() > 0) {
                    pw.println(nickName);
                    break;
                }
            }
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.setDaemon(true);
            t.start();
            System.out.println("开始聊天吧");
            while (true) {
                String str = sc.nextLine();
                if (str.equals("exit")) {
                    break;
                }
                pw.println(str);
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
    private class ServerHandler implements Runnable{
        @Override
        public void run() {
            try {
                InputStream input = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(input, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String line;
                while ((line = br.readLine())!=null){
                    System.out.println(line);
                }
            } catch (IOException e) {
            }
//            List<?> list = new ArrayList<>();
//            list.add("1");//不能确定添加什么类型
            //泛型在添加元素时需要明确类型，否则会导致编译错误。(除了null外)
            // 这是因为泛型在编译时会进行类型检查，确保类型的一致性。

            //用通配符搭配上限限定符时，通配符表示的范围是!!!指定类型或其子类型!!!
            // ，但不能对元素进行修改或添加。
            //通配符搭配上限限定符时，虽然可以读取元素，但无法确定通配符的具
            // 体类型，因此无法安全地进行增删修改操作。上限限定符限定了通配
            // 符的类型范围，但无法确切地确定通配符具体是哪个类或其子类。
            // 因此，编译器不允许进行增删修改操作，以确保类型安全。
            //通配符单独使用<明确的类型>
            //通配搭配上限限定符
            //<? extends 明确的类型>
            //下限通配符
            //<? super 明确的类型>
            //表示接收一个明确的类型或其父类
        }
    }
}
