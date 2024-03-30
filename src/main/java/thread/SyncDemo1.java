package thread;

public class SyncDemo1 {
    public static boolean success1 = false;
    public static boolean success2 = false;
    public static void main(String[] args) {
        Bank bank = new Bank();
//        Thread t1 = new Thread(()->{
//            success1 = bank.getMoney(20000);
//        });
//        Thread t2 = new Thread(()->{
//           success2 = bank.getMoney(20000);
//        });
        do {
            success1 = false;
            success2 = false;
            bank.saveMoney(20000);
            Thread t1 = new Thread(()->{
                success1 = bank.getMoney(20000);
            });
            Thread t2 = new Thread(()->{
                success2 = bank.getMoney(20000);
            });
            t1.start();
            t2.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(success1);
            System.out.println(success2);
            System.out.println(bank.getAccount());
        }while (!(success1==true&&success2==true));
    }
}
