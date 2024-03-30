package thread;

import java.util.Scanner;

public class SleepDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("程序开始了");
        System.out.println("请输入一个数字:");
        for (int num = sc.nextInt(); num >=0; num--) {
            System.out.println(num);
            if(num>0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("程序结束了");

    }
}
