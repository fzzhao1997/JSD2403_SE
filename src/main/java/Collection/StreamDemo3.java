package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList(new String[]{"one","two","three"}));
        list.add(Arrays.asList(new String[]{"four","five","six"}));
        list.add(Arrays.asList(new String[]{"seven","eight"}));
        System.out.println(list);
        List<String> collect = list.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
        //流整合,flatMap作用降维(再次把元素变流实现流整合降维)
        System.out.println(collect);
    }
}
