package reflect;

import java.lang.reflect.Field;

/*
* 反射机制操作属性*/
public class ReflectDemo8 {
    public static void main(String[] args) throws  Exception {
        System.out.println(new Teacher().name = "张三");
        Class cls = Class.forName("reflect.Teacher");
        Object o = cls.newInstance();

        Field field = cls.getDeclaredField("name");
        field.set(o,"李四");//设置属性
        System.out.println(o);
        Object value = field.get(o);//获得属性,返回object类型
        System.out.println(value);
    }
}

