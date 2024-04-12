package Map;

import java.util.HashMap;
import java.util.Map;

/*
* Map左列称为key,右列为value
* */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        //HashMap 内部使用了哈希桶来存储键值对，而桶的顺序会影响遍历时的输出顺序。
        map.put("B",99);
        map.put("A",60);
        map.put("D",89);
        map.put("E",19);
        System.out.println(map);
        Integer value = map.put("A",79);//重复key替换value,返回被替换元素,
        // 如果没有被替换返回null
        System.out.println(map);//map已被替换
        System.out.println(value);//被替换的value值
        Integer get = map.get("A");//返回值不要用in类型,避免null被int接收,
        // null只能被引用类型接收,表示引用变量没有指向任何对象
        //当一个引用变量被赋值为 null 时,意味着它不再引用堆内存中的任何对象，也不再占用对象的内存空间
        System.out.println(get);
        System.out.println();
        System.out.println(map.get("体育"));
        int size = map.size();//map大小
        System.out.println(size);
        Integer value2 = map.remove("A");//返回被删掉key对应的value
        System.out.println(value2);
        System.out.println(map.containsKey("A"));//是否包含key:"A"
        System.out.println(map.containsValue(99));//是否包含value:99
    }
}
