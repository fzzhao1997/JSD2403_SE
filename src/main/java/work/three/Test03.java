package work.three;


import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Random r = new Random();
        Collection<Integer> c = new HashSet<>();
        while (true) {
            c.add(r.nextInt(100)+1);
            if(c.size() == 10) {
                break;
            }
        }
        System.out.println(c);
        StringBuilder stringBuilder = new StringBuilder();
    }
}

