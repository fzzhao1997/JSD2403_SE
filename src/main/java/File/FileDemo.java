package File;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./demo.txt");
        System.out.println(file.length());//L型
        System.out.println(file.canRead());//BL型
        System.out.println(file.canWrite());//BL型
        System.out.println(file.isHidden());//BL型
    }
}
