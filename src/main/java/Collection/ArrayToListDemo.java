package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three"};
        System.out.println(Arrays.toString(arr));
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
        list.set(0, "six");//转化后与转化前有绑定关系
        System.out.println(Arrays.toString(arr));//six
        arr[0] = "seven";
        System.out.println(list);//seven

//        list.add("eight");//数组定长,报错,删不行,加也不行,只能改
//解决办法创建新列表取并集,或者创建新列表传进来
        List<String> list1 = new ArrayList<>(list);
//list1.addAll(list);
        System.out.println("list1:" + list1);
        list1.add("eight");
        System.out.println("list1:" + list1);
    }
}
