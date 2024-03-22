package String;

public class IndexOfDemo {
    public static void main(String[] args) {

        String line = "123 哈哈  哈哈";
        int index = line.indexOf("哈哈");
        System.out.println(index);
        int indexFrom = line.indexOf("哈哈",5);
        System.out.println(indexFrom);
        int lastIndex = line.lastIndexOf("哈哈");
        System.out.println(lastIndex);
        int lastIndexFrom = line.lastIndexOf("哈哈",9);
        System.out.println(lastIndexFrom);
    }
}
