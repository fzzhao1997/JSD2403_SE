package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//利用反射机制调用Person中本类自己定义的所有所有无参且公开的方法
public class Test2 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            int parameterCount = method.getParameterCount();
            int aPublic = Modifier.PUBLIC;
            if (modifiers == aPublic && parameterCount == 0) {
                System.out.println(method.getName());
                method.invoke(o);
                System.out.println("____________");
            }
        }
    }
}
