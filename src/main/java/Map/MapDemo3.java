package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        //forEach遍历
        Map<String,Integer> map = new HashMap<>();
        map.put("B",99);
        map.put("A",60);
        map.put("D",89);
        map.put("E",19);
        map.forEach((k,v)-> System.out.println(k+"="+v));
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        c.forEach((e)-> System.out.println(e));
        c.forEach(System.out::println);//lambda表达式方法引用,接收一个参数,传递一个数,省略参数名
    }
}
