package work.six;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 设计一个类:User
 * 里面有四个属性:String name d,String nick,int age
 * 定义get,set方法以及toString方法和构造方法
 * <p>
 * 单词记一记:
 * pwd   是单词password的缩写，是密码的意思
 * user  用户
 * <p>
 * <p>
 * 当前程序启动后要求用户顺序输入以上四个信息
 * 然后实例化一个User对象保存着四个信息并将
 * 该对象序列化到文件中。
 * 文件名的命名规则:用户名.obj
 * 比如该用户输入用户名为张三，那么这个对象
 * 序列化后的文件名为:张三.obj
 * <p>
 * 提高(选做):
 * 可以在用户输入信息后做必要的格式验证，比如4个信息是否
 * 都输入内容了。不能有空的。
 * 用户名只能包含字母数字下划线，并且1-32位
 *
 * @author Xiloer
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String inputName;
        String inputPwd;
        String inputNick;
        String inputAge;
        String regex = "[a-zA-z0-9_]{1,32}";
        String regexAge = "0|[1-9]\\d?|100";//0-100,0|1-9或1-9接0-9|100
        while (true) {
            System.out.println("请输入用户名");
            inputName = sc.nextLine();
            if (inputName.matches(regex)) {
                break;
            }
        }
        while (true) {
            System.out.println("请输入密码");
            inputPwd = sc.nextLine();
            if (!(inputPwd.isEmpty())) {
                break;
            }
        }
        while (true) {
            System.out.println("请输入别称");
            inputNick = sc.nextLine();
            if (!(inputNick.isEmpty())) {
                break;
            }
        }
        while (true) {
            System.out.println("请输入年龄");
            inputAge = sc.nextLine();
            if (inputAge.matches(regexAge)) {
                break;
            }
        }
        User user = new User(inputName, inputPwd, inputNick, Integer.parseInt(inputAge));
        File userFile = new File("./" + inputName + ".obj");
        userFile.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(userFile);
        PrintWriter pw = new PrintWriter(fileOutputStream, true,StandardCharsets.UTF_8);
        pw.println("用户名:"+inputName);
        pw.println("密码:"+inputPwd);
        pw.println("别称:"+inputNick);
        pw.println("年龄:"+inputAge);
        pw.close();
    }
}
