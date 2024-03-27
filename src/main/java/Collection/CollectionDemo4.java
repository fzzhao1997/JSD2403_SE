package Collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionDemo4 {
    public static void main(String[] args) {
       Collection<Point> c= new ArrayList<>();//<>规定的是元素类型,只能用<>中的类型
        Point p = new Point(1,2);
        c.add(p);
        c.add(p);
        System.out.println("p:"+p);
        System.out.println("c:"+c);
        p.setX(2);
        System.out.println("p:"+p);
        System.out.println("c:"+c);
        for(Point element:c){
            System.out.println(element);
        }
    }
}
