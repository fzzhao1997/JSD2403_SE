package File;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {
        for (char c = 'a';c<= 'z';new File(String.valueOf(c++)).delete()){}
        System.out.println("删除完毕");
    }
}
