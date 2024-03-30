package thread;

public class SyncDemo3 {
    public static void main(String[] args) {
        Boo bo1 = new Boo();
        Boo bo2 = new Boo();
        Thread t1 = new Thread(() -> Boo.doSome());
        Thread t2 = new Thread("哈哈哈") {
            public void run() {
                bo1.doSome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo {
    public static void doSome() {

            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + "正在执行doSome方法...");
                Thread.sleep(5000);
                synchronized (Boo.class) {
                    System.out.println(t.getName() + "执行doSome方法完毕!");
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
            }

    }
}
