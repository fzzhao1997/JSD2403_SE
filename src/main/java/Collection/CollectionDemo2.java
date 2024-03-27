package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new Point(1,2));
        //集合toString,先各自元素隐式转换,在每个元素去toString,这个toString看各自元素对应类型的toString
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        System.out.println(c);
        c.add(new Point(1,2));
        System.out.println(c);
        Point p2 = new Point(3, 4);
        boolean contains = c.contains(p2);
        System.out.println("集合是否包含p2:"+contains);
    }
}
