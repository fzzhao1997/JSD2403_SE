package warppar;

public class IntegerDemo1 {
    public static void main(String[] args) {
        //
        int a = 123;
        Integer i1 = new Integer(a);
        Integer i2= new Integer(a);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
//        Integer i1 = Integer.valueOf(a);
//        Integer i2 = Integer.valueOf(a);
        Double d = Double.valueOf(3.14);
        double a1= d.intValue();
        System.out.println(a1);
    }
}

