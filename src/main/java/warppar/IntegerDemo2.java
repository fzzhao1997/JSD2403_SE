package warppar;

public class IntegerDemo2 {
    public static void main(String[] args) {
        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);
        System.out.println(imax);
        String str = "123";
        int i = Integer.parseInt(str);
        System.out.println(i);
        double d = Double.parseDouble(str);
        System.out.println(d);
        method(i);
    }
    public static void method(Object i){
        Integer j = (Integer) i;//转Integer
//        System.out.println(i);object和int类型不能加,但sout支持object输出
        System.out.println(j+1);//拆箱后与int相加
        System.out.println("111");
        System.out.println("222");
        System.out.println("222");
    }
}
