package doc;

public class Demo {
    public static void main(String[] args) {
        DocDemo o = new DocDemo();
        System.out.println(o.sayHello("赵方舟"));
        String a  = "123";
        System.out.println(System.identityHashCode(a));
        String b = "123";
        System.out.println(System.identityHashCode(b));
//        a = "456";
//        System.out.println(System.identityHashCode(a));
        int d = 1;
        System.out.println(System.identityHashCode(d));
        int e = 1;
        System.out.println(System.identityHashCode(e));
        String s4 = new String("123");
        System.out.println("a==b:"+(a==b)+"a==s4:"+(a==s4));
        System.out.println(System.identityHashCode(s4));
        String s5 = "123"+"abc";
        String s6 = "1"+"23"+"abc";
        System.out.println(s5 == s6);
    }
}
