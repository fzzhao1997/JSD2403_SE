package FOS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("./image.jpg");
        FileOutputStream outputStream = new FileOutputStream("person.jpg");
        long start = System.currentTimeMillis();
        int i;
        while ((i = inputStream.read())!=-1){
            outputStream.write(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时"+(end-start)+"毫秒");
        inputStream.close();
        outputStream.close();
    }
}
