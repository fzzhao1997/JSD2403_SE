package Collection;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            c.add(r.nextInt(101));
        }
//        Collections.sort(c, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        Collections.sort(c,(o1,o2)->{return o2 - o1;});
        Collections.sort(c,(o1,o2)->o2 - o1);//Comparator传参类型与List一致
        System.out.println(c);
    }
}
