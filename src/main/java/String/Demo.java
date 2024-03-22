package String;

public class Demo {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        String str = point.toString();
        System.out.println(str);
        System.out.println(point);
//不重写的话,toString是转对象的地址,valueof是转对象(类型)
        String line ="这是一个point类"+point;
        System.out.println(line);
        System.out.println();
        Point point2 = new Point(1, 2);
        System.out.println(point2 == point);
        System.out.println(point.equals(point2));
    }
}
