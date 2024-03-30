package exception;

public class ThrowDemo {
    public static void main(String[] args) {//永远不要在main方法上throws
        Person p = new Person();
        try {
            p.setAge(1000);
            System.out.println("此人年龄:"+p.getAge());
        } catch (Exception e) {
            System.out.println("年龄输入不对");
            e.printStackTrace();
        }
    }
}
