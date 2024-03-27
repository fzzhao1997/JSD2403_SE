package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
//        String [] array = {"one","two","three","four","five"};
//        String [] arr = array;////地址值一样
//        System.out.println(arr);
//        System.out.println(array);
        //数组是知道一组的依次查询,但是依次查询的数组的连续的
        //链表是知道一组的依次查询,但是依次查询的数组的不连续的,链表每个部分作为对象散乱分散在堆内存中,每个部分记录上一个地址和下一个地址
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        System.out.println(list.get(0));//list支持查下标,collection不支持
//        System.out.println(list.set(0,"0"));

        for (int i = 0, j = list.size() - 1; i < list.size() / 2; j = list.size() - 1 - ++i) {
//            String temp = list.get(i);
//            list.set(i, list.get(j));
//            list.set(j, temp);
            String temp = list.get(i);//temp = i
            temp = list.set(j,temp);//j = i,j转i,并把j的转前的值赋值temp
            list.set(i, temp);//i = j
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}

