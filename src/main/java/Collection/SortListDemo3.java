package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("狗蛋");
        list.add("高绳子");
        list.add("臭傻逼");
        list.add("啥");
        list.add("1234545");
        list.add("11");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        System.out.println(list);
    }
}
