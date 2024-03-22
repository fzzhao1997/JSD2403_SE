package work.one;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        String code = getCode(5);
        testCode(code);

    }

    /**
     * @param n(int)-验证码个数
     * @return code(String)
     */
    public static String getCode(int n) {
        //验证码随机范围
        String line = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //验证码初始
        String code = "";
        //创建随机数对象
        Random random = new Random();
        //【在这里标注该句代码意义】
        for (int i = 0; i < n; i++) {
            code = code + line.charAt(random.nextInt(line.length()));
        }
        return code;
    }
        /**
         *
         * @param code
         */
        public static void testCode (String code){
            //创建键盘录入对象
            Scanner sc = new Scanner(System.in);
            //输入密码提示
            System.out.println("请输入验证码:" + code);
            //接收键盘录入对象
            String input = sc.nextLine();
            //判断密码是否正确
            if (input.equalsIgnoreCase(code)) {//String类的equals已重写,没重写继承object,object类没有字符串,只会对比地址值
                System.out.println("密码输入正确");
            } else {
                System.out.println("密码输入错误");
            }
        }
    }

