package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Random r = new Random();

        int sum;
        List<Integer> list;
        do {list = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                list.add(r.nextInt(101));
            }
            System.out.println(list);
            System.out.println("是否全部及格" + list.stream().allMatch(e -> e >= 60));

        }while ((sum=list.stream().reduce((e1, e2) -> e1 + e2).get())<=400);
        System.out.println("总分" + sum);
    }
}
