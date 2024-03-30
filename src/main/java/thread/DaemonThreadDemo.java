package thread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(()->{
            for (int i = 0;i<5;i++) {
                System.out.println("超耐磨");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("超耐磨结束");
        });
        Thread jack = new Thread(()->{
            while (true){
                System.out.println("大金表");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        rose.start();
        jack.setDaemon(true);
        jack.start();
        while (true){
            System.out.println(rose.isAlive());
        }
    }
}
