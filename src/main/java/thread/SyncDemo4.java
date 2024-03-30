package thread;

public class SyncDemo4 {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer();
        Thread t1 =  new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                sb.append("abc");
            }
        });
        Thread t2 =  new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                sb.append("abc");
            }
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb.toString());
    }
}
