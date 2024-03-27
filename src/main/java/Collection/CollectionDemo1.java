package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Integer i = 1;
        String str = i.toString();
//        Collection c = new ArrayList();//向上造型
        Collection  c = new HashSet();//向上造型
        System.out.println(c.add("one"));
        c.add("two");
        c.add("three");
        c.add("four");
        System.out.println(c.add("one"));
        System.out.println(c.toString());//集合输出自动toString
        System.out.println("size:"+c.size());//集合size不同于数组长度,数组length空的也算进长度里,但集合没有长度,指的数组个数
        System.out.println(c.isEmpty());////判断集合是不是空
        Collection d = new ArrayList();
        System.out.println(d == null);//判断集合是不是存在
        d.clear();
        System.out.println(d == null);
        c.clear();
        System.out.println("size:"+c.size());
        System.out.println(c.isEmpty());
    }
}
