package FOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./fos.dat");//方式一，创建文件输出流链接到指定的文件上，没有会自己创建，但地址要正确
/*        File file = new File("./fos.dat");
        FileOutputStream fos = new FileOutputStream(file);*///方式二，创建文件出流链接到file表示的文件上
        //二进制：
        // 00000000为0
        //11111111为-1，加1变100000000，略去首位，00000000
        //01111111为127,0表整数位，1表负数位，正数位最大值为127,01111111；正数最小值，1,00000001；负数位最大值为-1,11111111；负数最小值-128,10000000
        fos.write(1);//只能写0-255因为会截，比如-1，二进制为11111111 11111111 11111111 11111111，截为11111111，
        // 读的时候又补三个为00000000字节，变为00000000 00000000 00000000 11111111,变为255
        fos.write(2);
        System.out.println("写出完毕");
        fos.close();//写完要关闭
    }
}
