package Collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(10));
        }
        //*3
        System.out.println(list);
        List<Integer> collect = list.stream().map(element -> element * 3).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> list1 = collect;
        System.out.println(list1 == collect);

        //collect前流式操作不改变原有列表元素,collect后用原有列表接收的话会改变
        //只要偶数
        List<Integer> evenNumberList = list.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumberList);
        //去重
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);
        //排序
        collect = list.stream().sorted((o1,o2)->o2-o1).collect(Collectors.toList());
        System.out.println(collect==list1);//collect只相当于一个索引,流式collect会开辟新空间去接收,赋值给原有变量后,相当于索引指向地址值改变
        collect = list.stream()
                .map(element -> element * 3)
                .filter(element -> element % 2 == 0)
                .distinct().sorted((o1, o2) -> o2 - o1)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

