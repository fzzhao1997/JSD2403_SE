package reflect;


import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class ReflectDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个类名:");
//        Class cls = String.class;
//        Class cls = Object.class;
//        try {
//          Class  cls = Class.forName("java.lang.Object");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        try {
          Class  cls = Class.forName(sc.nextLine());
            System.out.println(cls.getName());//获取类的全限定名
            System.out.println(cls.getSimpleName());//获取类的类名
            Package p = cls.getPackage();//获取包对象
            System.out.println(p);
            System.out.println(p.getName());//获取包名
            Method[] methods = cls.getMethods();//类中方法,返回方法的数组
            System.out.println(cls.getSimpleName()+"类共有"+methods.length+"个方法");
            for(Method m:methods){
                System.out.println(m.getName());
            }
            System.out.println(Arrays.toString(methods));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
