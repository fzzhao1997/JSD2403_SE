package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.Student");//获取类对象
        Object o = cls.newInstance();//无参构造器实例化
        System.out.println(o);
        Constructor constructor = cls.getConstructor(String.class, int.class, char.class);//获取指定定构造器
        Object o1 = constructor.newInstance("赵六", 19, '无');//指定构造器实例化
        System.out.println(o1);
    }
}
