package String;

import java.util.Arrays;
//方括号 [] 用于表示字符集合或者字符范围，它可以匹配其中任意一个字符。没有方括号时，通常表示单个字符或者字符序列。
public class SplitDemo2 {
    public static void main(String[] args) {
        String str = "a=b=c=d=e=f=======";
        String[] arr = str.split("=");
        System.out.println(Arrays.toString(arr));
        arr = str.split("=",2);
        System.out.println(Arrays.toString(arr));
        arr = str.split("=",3);
        System.out.println(Arrays.toString(arr));
        arr = str.split("=",50);
        System.out.println(Arrays.toString(arr));
        arr = str.split("=",0);//与("=")一致,拆了有空,但后面没东西舍弃空
        System.out.println(Arrays.toString(arr));
        arr = str.split("=",-1);//应拆尽量拆
        System.out.println(Arrays.toString(arr));
    }
}
