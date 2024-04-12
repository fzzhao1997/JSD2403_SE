package reflect;

import reflect.annotations.AutoRunClass;

import java.lang.reflect.Modifier;

public class ReflectDemo9 {
    public static void main(String[] args) throws Exception{
        Class cls =  Class.forName("reflect.Person");
        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);//是否被AutoRunClass的注解标注,返回布尔型
        if(mark){
            System.out.println("被标注了");
        }else {
            System.out.println("没有被标注");
        }
    }
}
