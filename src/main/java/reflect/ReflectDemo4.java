package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

//使用反射机制调方法
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
/*    Class cls = Class.forName("reflect.Person");//获取类对象cls
    Object obj = cls.newInstance();//通过类对象方法将类对象实例化为obj

        Method method = cls.getMethod("sayHello");//通过类对象方法获取方法sayHello
        method.invoke(obj);//通过获取的方法直接调用,内部存在强转*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入类对象:");
        String className = sc.nextLine();
        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        System.out.println("请输入方法名:");
        String methodName = sc.nextLine();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
