package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c1 = new HashSet();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1:"+c1);
//        Collection c2 = new ArrayList();
        Collection c2 = new ArrayList();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2:"+c2);
        c1.addAll(c2);//取并集
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
        Collection c3 = new ArrayList();
        c3.add("java");
        c3.add("php");
        c1.retainAll(c3);
        System.out.println("c1"+c1);
        System.out.println("c3"+c3);
        c2.removeAll(c3);//取补集
        c2.remove(c3);//删除单个元素,即删除c2中某个元素c3,元素c3是集合,没有删不了
        System.out.println("c2:"+c2);
        System.out.println("c3"+c3);
        c2.remove("android");
        System.out.println("c2:"+c2);
        Collection c4 = new ArrayList();
        c4.add("android");
        c4.add("ios");
        c4.add("java");
        System.out.println(c4.containsAll(c2));
    }
}
