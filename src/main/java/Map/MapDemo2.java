package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("B",99);
        map.put("A",60);
        map.put("D",89);
        map.put("E",19);
        System.out.println(map);
        //遍历所有key
        Set<String> keySet = map.keySet();//返回Key的set集合
        for(String e:keySet){
            System.out.println(e);
        }
        //遍历所有value
        Collection<Integer> values = map.values();//返回value的Collection集合
        for(Integer e:values){
            System.out.println(e);
        }
        //遍历键对
        Set<Entry<String, Integer>> entries = map.entrySet();
        //返回键值对的Set集合,集合类型为Entry<key的类型,value的类型>Entry是条目的意思
        //导包后Entry就行,没导包Map.Entry
        for (Entry e:entries){
            System.out.println(e);
        }
    }
}
