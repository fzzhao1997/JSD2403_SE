package Map;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String line = "i love java!";
        Map<Character, Integer> map = new HashMap<>();
        char c= ' ';
        for (int i = 0; i < line.length(); c = line.charAt(i++)) {
            if (c != ' ') {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c)+1 );//获得map的value数值+1
                    //++只能适用有变量类型,map.get(c),未返回无法++
                    //只能用map.get(c)不能用v++,这样不同类的互斥
                } else {
                    map.put(c, 1);//没有就设置
                }
            }
        }
        System.out.println(map);
    }
}
