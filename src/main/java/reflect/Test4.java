package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入类:");
        String str = sc.nextLine();
        Class cls = Class.forName(str);
        if(cls.isAnnotationPresent(AutoRunClass.class)){
            Method[] methods = cls.getMethods();//getDeclaredMethods只能有子类方法,重写的也不行
            Object o = cls.newInstance();
            for(Method method:methods){
                if(method.isAnnotationPresent(AutoRunMethod.class)){
                    AutoRunMethod aRM = method.getAnnotation(AutoRunMethod.class);
                    int value = aRM.value();
                    for (int i = 0; i < value  ; i++) {
                        method.invoke(o);
                    }
                }
            }
        }else {
            System.out.println(cls.getSimpleName()+"类没有被标注");
        }
    }
}
