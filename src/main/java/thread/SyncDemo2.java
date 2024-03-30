package thread;

public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread("老范"){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread("老王"){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();

    }
}
class Shop{
    public void buy(){
        try {
            Thread t = Thread.currentThread();//获取当前正在执行的线程对象,并返回当前正在执行的线程对象。线程1进来就是线程1,线程2进来就是线程2
            String name = t.getName();
            System.out.println(name+":正在挑衣服...");
            Thread.sleep(5000);
            synchronized (this) {//this指代本类对象,相当于把shop锁上,而不是把当前线程锁上,锁也应该锁对象,调谁锁谁
                //()只要是对象都行,但根据业务要求
                //同步监视对象指定谁,同步块未执行完前锁谁
                System.out.println(name + ":正在试衣服...");
                Thread.sleep(5000);
            }
            System.out.println(name+":结账离开");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}