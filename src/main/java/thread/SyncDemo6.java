package thread;

public class SyncDemo6 {
    public static void main(String[] args) {
        FOO f = new FOO();
        Thread t1 = new Thread(f::methodA);
        Thread t2 = new Thread(){
            public void run(){
                f.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}
class FOO{
    public synchronized void methodA(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在执行A方法");
            Thread.sleep(5000);
            System.out.println(t.getName()+":执行A方法完毕!");
        } catch (InterruptedException e) {
        }
    }
    public synchronized void methodB(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在执行B方法");
            Thread.sleep(5000);
            System.out.println(t.getName()+":执行B方法完毕!");
        } catch (InterruptedException e) {
        }
    }
}
