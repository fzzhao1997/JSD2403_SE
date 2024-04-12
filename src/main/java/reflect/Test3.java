package reflect;

import reflect.annotations.AutoRunClass;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入类名:");
        String str = sc.nextLine();
        Class cls = Class.forName(str);
        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        if(mark){
            Object o = cls.newInstance();
            System.out.println(cls.getSimpleName()+"类已被实例化");
            Method toString = cls.getMethod("toString");
            System.out.println(toString.invoke(o));
        }else {
            System.out.println(cls.getSimpleName()+"类没有被注解标注");
        }
    }
}
