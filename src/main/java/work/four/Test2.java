package work.four;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 * <p>
 * 单词记一记:
 * exsits 存在
 * create 创建
 * new    新的
 *
 * @author Xiloer
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("程序启动");
        File file;
        while (true) {
            System.out.println("请输入文件名:");
            String inputName = sc.nextLine();
            file = new File("./" + inputName);
            if (file.exists()) {
                System.out.println(file.getName()+"文件存在,请更换名字");
            }else{
                file.createNewFile();
                break;
            }
        }
        System.out.println(file.getName()+"创建成功");
    }
}
