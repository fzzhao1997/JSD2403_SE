package File;

import java.io.File;

public class Test {
    public static void main(String[] args) {
//        char[] arr = new char[26];
//        for (char i = 0; i < arr.length; i++) {
//            arr[i]=(char) (97+i);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            File file = new File(arr[i]+"目录");
////            file.mkdirs();
//            file.delete();
//        }
        for (char c = 'a';c<= 'z';c++){
            File dir = new File(String.valueOf(c));
            dir.mkdirs();
        }
        System.out.println("创建完毕");
    }
}
