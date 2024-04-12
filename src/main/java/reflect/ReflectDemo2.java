package reflect;

import java.util.Scanner;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Person p = new Person();
        System.out.println(p);
        //反射机制实例化
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();//只适用于无参构造器
        System.out.println(obj);
        System.out.println(p==obj);//false
        Person person = (Person) obj;
        System.out.println(person);
        System.out.println(person == obj);//ture
        //向下造型或向上造型成功后，得到的对象是同一个对象，只是以不同的类型引用它。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个类名");
        String name = sc.nextLine();
        Class cls2 = Class.forName(name);
        Object obj2 =  cls2.newInstance();
        System.out.println(obj2);
    }
}
