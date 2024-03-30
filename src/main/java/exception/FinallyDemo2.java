package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyDemo2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;//局部变量一定要初始化
        try {
            fos = new FileOutputStream("fos.dat");
            fos.write(1);
        } catch (IOException e) {
            System.out.println("出错了");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("出错了");
            }
        }
    }
}
