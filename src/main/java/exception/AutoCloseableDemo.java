package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("fos.dat");
        ) {//实现了autocloseable接口才能写在try()里面,所有的流都实现了
            fos.write(1);
        } catch (IOException e) {
            System.out.println("出错了");
        }
    }
}
