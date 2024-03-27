package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(10,20));
        list.add(new Point(5, 30));
        list.add(new Point(20, 10));
        list.add(new Point(30, 5));
        list.add(new Point(15, 15));
        System.out.println(list);
//        Comparator<Point> comparator = new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                int len1 = o1.getX()* o1.getX()+o1.getY()*o1.getY();
//                int len2 = o2.getX()* o2.getX()+o2.getY()*o2.getY();
//                return len2-len1;
//            }
//        };
        Collections.sort(list,new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()* o1.getX()+o1.getY()*o1.getY();
                int len2 = o2.getX()* o2.getX()+o2.getY()*o2.getY();
                return len2-len1;
            }
        });
        System.out.println(list);
    }
}
