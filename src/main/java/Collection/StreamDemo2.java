package Collection;

import java.util.*;

public class StreamDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(r.nextInt(100));
        }
        System.out.println(list);
        //min:获取列表最小值
        //Optional类似包装类,每个实例内部保存一个java中的对象
        Optional<Integer> min = list.stream().min((o1, o2) -> o1 - o2);
        Integer minElement = min.get();
        System.out.println(minElement);
        Integer maxElemnet = list.stream().max((o1, o2) -> o1 - o2).get();
        System.out.println(maxElemnet);
        //列表中是否有偶数
        System.out.println(list.stream().anyMatch(e -> e % 2 == 0));//anyMatch有一个匹配就行
        System.out.println(list.stream().allMatch(e -> e % 2 == 0));//allMatch全部匹配才行
        System.out.println(list.stream().allMatch(e -> e > 5));
        //集合是否所有元素都是奇数
        System.out.println(list.stream().noneMatch(e -> e % 2 == 0));
        System.out.println(list.stream().reduce((e1, e2) -> e1 + e2).get());
    }
}
