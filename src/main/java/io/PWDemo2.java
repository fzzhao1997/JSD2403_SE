package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("pw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);//高级流,缓存流作用字符流转字节流
        BufferedWriter bw = new BufferedWriter(osw);//高级流,作用接收字符串或数组，若接收字符串会转数组储存,缓存多个字符流后(默认8192)传给缓冲流
        //所有高级流都封装了下一级的低级流， 低级流只有FileOutputStream和FileIntStream
        PrintWriter pw = new PrintWriter(bw);//高级流,作用换行,字符串换行

    }
}
