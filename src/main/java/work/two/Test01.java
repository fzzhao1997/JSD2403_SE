package work.two;

import java.util.Scanner;

/**
 * 正则表达式练习:
 * 1:编写匹配数字的正则表达式,数字至少一位以上.
 * <p>
 * 2:匹配字符串,要求输入3-15位,内容只能是数字,字母下,划线
 * <p>
 * <p>
 * 完成下面编程题:
 * 程序启动后,要求用户输入用户名,用户名出现内容要求上述正则表达式2的要求.不匹配则直接
 * 提示用户名有误.
 * 如果无误,则要求用户继续输入年龄,规则为上述正则表达式1的要求,不匹配则提示年龄有误
 * 以上两个输入获取是都要求以字符串形式接受(Scanner的nextLine方法获取)
 * <p>
 * 最后验证年龄在1-100岁之间(包含1和100)
 * 提示:这里可以不用正则表达式验证范围,是否转换为数字判定更方便?
 *
 * @author Xiloer
 */
public class Test01 {
    public static void main(String[] args) {
/*    String regex = "\\w";
    String str = "123465asdfdf_";
        System.out.println(str.matches(regex));*/
        String regexName = "\\w{3,15}";
        String regexAge = "[\\d&&[^0]\\d?|100";//[^b] 表示匹配除了字符 "b" 以外的任意字符。而 ^b 是语法错误，因为它没有在 [] 内部使用^必须与[]配合使用,为了后续取交集
        //&&也必须与[]配合使用,确定取了交集后为一个字符(取交集就为了确定那一个字符取交集),一般取交集整个结果[]起来
        //[\d^0]\d?|100也对,是第一个[]内0-9和非0的范围,并不是去交集,是指的\d(0-9)范围要除开0,然后这个范围是关于一个字符,即最外层[]作用
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("请输入用户（3-15字母、数字、下划线）:");
            input = sc.nextLine();
            if(input.matches(regexName)){
                System.out.println("您的用户名为:"+input);
                break;
            }else{
                System.out.println("你输入的用户名有误");
            }
        } while (true);
        do {
            System.out.println("请输入年龄:");
            input = sc.nextLine();
            if(input.matches(regexAge)){
                System.out.println("您的年龄为:"+input);
                break;
            }else{
                System.out.println("你输入的年龄有误");
            }
        } while (true);
    }
}
