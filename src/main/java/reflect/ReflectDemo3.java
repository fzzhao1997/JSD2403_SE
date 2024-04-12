package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person p = new Person("李四",15);
        System.out.println(p);
        Class cls = Class.forName("reflect.Person");
//        cls.getConstructor();//Person()无参构造器
        Constructor constructor = cls.getConstructor(String.class, int.class);
        Object obj = constructor.newInstance("王五",22);//指定构造器
        System.out.println(obj);
    }
}
