package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Comparator<String> comparator = (o1, o2) -> o2.length() - o1.length();
        Comparator<String> comparator2 = (String o1,String o2)->{return o2.length() - o1.length();};
        List <String> list = new ArrayList<>();
        list.add("氪金老师");
        list.add("传奇");
        list.add("王伟超");
        Collections.sort(list,((o1, o2) -> o1.length()-o2.length()));
    }
}
