package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //1.OutputStreamWriter 主要负责将字符转换为字节，然后将字节写入到底层的字节流中，它的功能
        // 更偏向字符编码和字节流的桥接。
        //2.PrintWriter 则更像是一个便捷的字符输出工具，它的功能不仅限于写入字符数据
        // ，还可以直接输出各种数据类型，例如字符串、基本数据类型等，而且它可以直接指向底层的
        // 字节流或字符流，不需要进行字符到字节的转换。
        PrintWriter pw = new PrintWriter("pw.txt");//连接地址与write反序,是低级流区调用高级流
        pw.println("哈哈哈哈哈哈");
        pw.println("wqnmlgb");
        pw.println("菜就多练,输不起就别玩");
        pw.close();//close中有plash
    }
}
