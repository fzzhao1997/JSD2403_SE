package File;

import java.io.File;

public class ListFileDemo {
    public static void main(String[] args) {
        File dir = new File(".");//路径当前文件夹
        if(dir.isDirectory()){//判断是不是文件夹
            File[] files = dir.listFiles();
            for(File file:files){
                System.out.println(file.getName());
                System.out.println(file.isFile());//判断是不是文件
            }
        }
    }
}
