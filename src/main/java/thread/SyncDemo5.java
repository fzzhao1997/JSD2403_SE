package thread;

import java.util.*;

public class SyncDemo5 {
    public static void main(String[] args) {
//            Collection<Integer> c = new ArrayList<>();
////    Collection<Integer> c = new LinkedList<>();
        HashSet<Integer> c = new LinkedHashSet<>();//按插入顺序的HashSet
//        HashSet<Integer> c = new HashSet<>();//不按插入顺序,而按哈希值排顺序
//        List<Integer> c = Collections.synchronizedList(new ArrayList<Integer>());
//        Set<Integer> c = Collections.synchronizedSet(new HashSet<>());
        Thread t1 = new Thread(()-> {
            for (int i = 1000; i >=0; i--) {
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
class ff{
    public static void main(String[] args) {
        Collection c2 = new HashSet();
        c2.add("A");
        c2.add("C");
        c2.add("B");//c1中存在的元素
        System.out.println("c2:"+c2);
    }
}
