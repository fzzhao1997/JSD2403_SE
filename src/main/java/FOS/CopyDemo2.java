package FOS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("./image.jpg");
        FileOutputStream outputStream = new FileOutputStream("person.jpg");
        long start = System.currentTimeMillis();
        byte[] arr = new byte[1024*10];
        int len;
        while ((len = inputStream.read(arr))!=-1){
            outputStream.write(arr,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时"+(end-start)+"毫秒");
        inputStream.close();
        outputStream.close();
    }
}
