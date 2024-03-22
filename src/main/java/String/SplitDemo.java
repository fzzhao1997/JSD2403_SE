package String;


import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        String[] words = line.split("[0-9]+");
        System.out.println(Arrays.toString(words));
        line = "=abc==def======ghi====";//拆分后若后面有东西就有空串,没有就不会产生
        words = line.split("[=]+");
        System.out.println(words.length);
        System.out.println(Arrays.toString(words));
        line = "abc.def.ghi";
        //内部\不是全部.,外部\,Java转译,java没有\.形式,需再转译一次
        words = line.split("\\.");
        System.out.println(Arrays.toString(words));
    }
}
