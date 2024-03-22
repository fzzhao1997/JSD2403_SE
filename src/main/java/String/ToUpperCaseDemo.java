package String;

import java.util.Scanner;

public class ToUpperCaseDemo {
    public static void main(String[] args) {
        char a = 48;

        String code = "12asSD";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码:"+code);
        String input = sc.nextLine();
//        if(input.toUpperCase().equals(code.toUpperCase())){
//            System.out.println("密码正确");
//        }else{
//            System.out.println("密码错误");
//        }
        if(input.equalsIgnoreCase(code)){
            System.out.println("密码正确");
        }else {
            System.out.println("密码错误");
        }
    }
}
