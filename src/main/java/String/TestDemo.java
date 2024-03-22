package String;

public class TestDemo {
    public static void main(String[] args) {
        String s1 = "http://www.tedu.com.cn";
        String s2 = "doc.codebody.com";
        System.out.println(System.identityHashCode(s1));
        System.out.println(getHostName(s1));
        System.out.println(getHostName(s2));
    }
    public static String getHostName(String line){
        int index1 = line.indexOf(".")+1;
        int index2 = line.indexOf(".",index1);
        String name = line.substring(index1,index2);
        return name;
    }
}
