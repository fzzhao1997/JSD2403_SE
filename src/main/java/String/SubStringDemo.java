package String;

public class SubStringDemo {
    public static void main(String[] args) {
        String line = "www.tedu.cn";
        String sub = line.substring(4,8);//8不取,4取
        System.out.println(sub);
        sub = line.substring(4);
        System.out.println(sub);
    }
}
