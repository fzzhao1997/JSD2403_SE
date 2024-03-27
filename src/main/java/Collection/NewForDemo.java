package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class NewForDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);
        for (String str : c) {
//            if ("#".equals(str)) {
//                c.remove(str);
//            }//已经在集合循环,不能改数组,不然没法循环
            System.out.println(str);
        }
        String [] array = {"one","two","three","four","five"};
        //新循环遍历数组
        for(String str : array){
            System.out.println(str);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
