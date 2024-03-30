package thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyTread();
        Thread t2 = new MyTread2();
        t1.start();
        t2.start();
    }
}

class MyTread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你过来啊");
        }
    }
}

class MyTread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("滚犊子");
        }
    }
}
