package reflect;
//反射调用的是编译后的文件
import java.lang.reflect.Method;

/*反射机制调用有参方法*/
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        Method say = cls.getMethod("say", String.class);
        say.invoke(o,"大家好");
        Method say1 = cls.getMethod("say", String.class,int.class);
        say1.invoke(o,"大家好",6);
    }
}
