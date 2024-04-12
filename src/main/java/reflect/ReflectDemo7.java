package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo7 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        Method[] methods = cls.getDeclaredMethods();
        for(Method m:methods){
            System.out.println("方法名:"+m.getName());
            System.out.println("参数个数:"+m.getParameterCount());
            int modifiers = m.getModifiers();

            switch (modifiers){
                case Modifier.PUBLIC:
                    System.out.println("public");
                    break;
                case Modifier.PRIVATE:
                    System.out.println("private");
                    break;
                case Modifier.PROTECTED:
                    System.out.println("protected");
                    break;
                default:
                    System.out.println("默认方法");
            }
        }

    }
}
