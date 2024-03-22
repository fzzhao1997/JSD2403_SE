package String;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        String result = line.replaceAll("[0-9]+", "NUMBER");
        System.out.println(result);
        //[0-9]满足替换,每次都替换,[0-9]+,会找到有几次满足,并属于一次以上,再全部替换,即一次以上到底有几次,找到灭有为止
        //和谐用语
        String regex = "(wqnmlgb|dsb|nc|cnm|mdzz|nmsl|djb)";
        String message = "wqnmlgb!你个dsb!你怎么这么的nc!你个djb!";
        message = message.replaceAll(regex,"牛逼");
        System.out.println(message);
    }
}
