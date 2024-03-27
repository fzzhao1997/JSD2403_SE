package FOS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        int d ;
        while ((d = fis.read())!=-1) {//变量初始化才能判断
            System.out.println((char) (d));
        }
        fis.close();
    }
}
