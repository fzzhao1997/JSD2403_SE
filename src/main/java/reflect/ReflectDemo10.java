package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class ReflectDemo10 {
    public static void main(String[] args) throws  Exception{
        //查看Person类上的study方法是否被注解@AutoRunMethod标注
        Class cls = Class.forName("reflect.Person");
//        Method study = cls.getDeclaredMethod("study");
        Method study = cls.getDeclaredMethod("playGame");
        if(study.isAnnotationPresent(AutoRunMethod.class)){
            System.out.println("方法被标注了");
        }else {
        System.out.println("没有被标注了");
        }
    }
}
