package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        String[] array = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(array));
        System.out.println(array+""+c);
    }
}
