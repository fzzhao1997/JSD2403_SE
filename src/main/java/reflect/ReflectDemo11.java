package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class ReflectDemo11 {
    public static void main(String[] args) throws Exception{
        //获取Person类上Sleep上的注解@AutoRunMethod中的参数值
        Class cls = Class.forName("reflect.Person");
        Method method = cls.getDeclaredMethod("sleep");
        if(method.isAnnotationPresent(AutoRunMethod.class)){
            AutoRunMethod ARM = method.getAnnotation(AutoRunMethod.class);
            int value = ARM.value();
            System.out.println(value);
        }
    }
}
