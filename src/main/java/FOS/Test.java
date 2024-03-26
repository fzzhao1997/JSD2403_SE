package FOS;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream text = new FileOutputStream("./test.txt");//链接硬盘上，数据存入硬盘上
        for (char i = 97; i <= 'z'; i++) {//存在i++强转,char运算时变int,又强转变为char
            text.write(i);//write方法接收的是int的低八位，这里存在隐式转换，char转int类型，且接收为低八位
        }
        for (char i = 65; i <= 'Z'; i++) {
            text.write(i);
        }
        System.out.println("写出完毕");
        text.close();
    }
}
