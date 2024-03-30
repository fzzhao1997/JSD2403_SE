package thread;

import java.util.*;

public class SyncDemo5 {
    public static void main(String[] args) {
//            Collection<Integer> c = new ArrayList<>();
////    Collection<Integer> c = new LinkedList<>();
        Collection<Integer> c = new HashSet<>();
//        List<Integer> c = Collections.synchronizedList(new ArrayList<Integer>());
//        Set<Integer> c = Collections.synchronizedSet(new HashSet<>());
        Thread t1 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                c.add(i);
            }
        });
//        Thread t2 = new Thread(){
//            public void run(){
//                for (int i = 1000; i < 2000; i++) {
//                    c.add(i);
//                }
//            }
//        };
        t1.start();
//        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(c.size());
        System.out.println(c);
    }
}
