package work.four;

import java.util.*;

/**
 * 在一个List集合中生成20个随机整数(100以内)
 * 然后按照从小到大的顺序排列，排好后再将第6个-第15个元素
 * 按照从大到小顺序排列，并最终输出集合
 * 例如:
 * 1,2,3,4,5,15,14,13,12,11,10,9,8,7,6,16,17,18,19,20
 * @author pc
 *
 */
public class Test1 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        Random r = new Random();
//        for (int i = 0; i < 20; i++) {
//            list.add(r.nextInt(101));
//        }
//        Collections.sort(list);
//        System.out.println(list);
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        };//创建一个派生类的对象,但重写方法写在方法体里面,相当于只能创建一次对象,若要创建要再写一次匿名内部类
//        List<Integer> subList = list.subList(5, 15);
//        Collections.sort(subList,comparator);
//        System.out.println(subList);
//        System.out.println(list);
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(101));
        }
        Collections.sort(list);//首次排序//无return不能链式编程传参
        System.out.println(list);
        Collections.sort(list.subList(5, 15),(o1,o2)->o2-o1);//子列表排序
        System.out.println(list);
    }
}
