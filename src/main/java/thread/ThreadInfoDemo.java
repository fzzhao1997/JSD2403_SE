package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("主线程" + main);
        showInfo();
        System.out.println(main.getName());
        System.out.println(main.getId());
        System.out.println(main.getPriority());

        Thread thread = new Thread(()->{ Thread t = Thread.currentThread();
            System.out.println("运行showInfo的线程是:" + t);});
        thread.start();
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());
        System.out.println(thread.isInterrupted());

    }

    public static void showInfo() {
        Thread t = Thread.currentThread();
        System.out.println("运行showInfo的线程是:" + t);
    }
}

