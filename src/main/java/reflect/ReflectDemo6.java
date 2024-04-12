package reflect;

import java.lang.reflect.Method;

//获取私有方法,getDeclared...获取本类自己的,包含私有的,不能获取超类的
public class ReflectDemo6 {
    public static void main(String[] args) throws Exception{
       Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
        Method hehe = cls.getDeclaredMethod("hehe");
        hehe.setAccessible(true);
        hehe.invoke(o);
        hehe.setAccessible(false);
    }
}
