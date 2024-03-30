package thread;

import java.sql.SQLOutput;

public class SleeoDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(()->{
            System.out.println("林:刚美完容,睡一会儿吧...");
            try {
                Thread.sleep(50000000);
            } catch (InterruptedException e) {
                System.out.println("林:干嘛呢!干嘛呢!");
            }
            System.out.println("林:醒了");
        });
        Thread wang = new Thread(()->{
            System.out.println("王:大锤八十小锤40");
            for (int i= 0;i<5;i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("王:大锤八十");
                } catch (InterruptedException e) {
                }
            }
            lin.interrupt();//中断lin线程的睡眠阻塞
        });
        lin.start();
        wang.start();
    }
}
