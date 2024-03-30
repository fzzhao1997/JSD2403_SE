package thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();//存任务
        Thread t1 = new Thread(r1);//任务放线程
        Thread t2 = new Thread(r2);
        t1.start();//启动线程
        t2.start();

    }
}
class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("你过来啊");
        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("得加钱");
        }
    }
}