package thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread nom = new Thread(()-> {
            for (int i = 0; i < 10000;i++) {
                System.out.println("nom");
            }
        });
        Thread min = new Thread(()-> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("min");
            }
        });
        Thread max = new Thread(()-> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("max");
            }
        });
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        nom.start();
        min.start();
        max.start();
    }
}
