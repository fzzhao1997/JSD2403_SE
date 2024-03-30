package exception;

public class Person {
    private int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age<0||age>100){
//            throw new RuntimeException("年龄超出了范围");,只有RuntimeException可以不写throws
            throw new IllegalAgeException("年龄超出了范围");
        }
        this.age = age;
    }
}
