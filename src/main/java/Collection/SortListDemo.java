package Collection;

import java.util.*;
import java.util.Collection;

public class SortListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(100) + "");
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<String> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list3.add(r.nextInt(100) + "");
        }
        System.out.println(list3);

    }
}
