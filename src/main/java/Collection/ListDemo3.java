package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        List<Integer> sublist = list.subList(3, 8);//子集方法
        System.out.println(sublist);
        for (int i = 0; i < sublist.size(); i++) {
            sublist.set(i, sublist.get(i) * 10);
        }
        System.out.println(sublist);
        System.out.println(list);
//        list.removeAll(sublist);
//        System.out.println(list);
//        list.subList(2,9).clear();
//        System.out.println(list);

    }
}
