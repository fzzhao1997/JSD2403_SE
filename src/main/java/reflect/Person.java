package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Person {

    private String name = "张三";
    private int age = 18;

    public Person() {
    }

    public Person( String name, int age) {
        this.name =  name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void sayHello() {
        System.out.println(name + ":hello!");
    }
    @AutoRunMethod
    public void sayHi() {
        System.out.println(name + ":Hi!");
    }
    public void doSome() {
        System.out.println(name + ":做某事");
    }
    @AutoRunMethod(10)
    public void sleep() {
        System.out.println(name + ":睡觉");
    }

    public void watchTV() {
        System.out.println(name + ":看电视123132");
    }
    @AutoRunMethod
    public void study() {
        System.out.println(name + ":在学习");
    }

    public void playGame() {
        System.out.println(name + ":玩游戏");
    }
    @AutoRunMethod
    public void sing() {
        System.out.println(name + ":在唱歌");
    }

    public void say(String info) {
        System.out.println(name + ":" + info);
    }

    public void say(String info, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name + ":" + info);
        }
    }
    private void hehe(){
        System.out.println("我是Person的私有方法!");
    }
}
