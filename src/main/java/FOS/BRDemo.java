package FOS;

import java.io.*;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/java/FOS/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);//输入字节流
        BufferedReader br = new BufferedReader(isr);//输入Reader类型参数
        BufferedReader br2 = new BufferedReader(br);//输入Reader类型参数
        String line;
        while ((line = br2.readLine())!=null){
            System.out.println(line);
        }
        br2.close();
    }
}
