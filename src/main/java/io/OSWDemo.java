package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        String line = "123424";
        FileOutputStream fos = new FileOutputStream("osw.txt");//输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);//转换流,依托低级流,并声明期unicode格式,避免别的电脑冲突
        osw.write(line);
        osw.write("134141412313");
        System.out.println("写出完毕");
        osw.close();
    }
}
