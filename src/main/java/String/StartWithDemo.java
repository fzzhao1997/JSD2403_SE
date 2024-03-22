package String;

public class StartWithDemo {
    public static void main(String[] args) {
        String line = "www.tedu.cn";

        boolean start1 = line.startsWith("www");
        System.out.println(start1);
        System.out.println(line.startsWith("http"));
        System.out.println(line.endsWith("/cn"));
        System.out.println(line.endsWith("cn"));
        System.out.println(line.endsWith(".cn"));
    }
}
