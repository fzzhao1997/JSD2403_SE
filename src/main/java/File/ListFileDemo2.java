package File;

import java.io.File;

public class ListFileDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if(dir.isDirectory()){
//            File[] files = dir.listFiles((File file)->file.getName().startsWith("."));//列出文件并过滤数组接收
            File[] files = dir.listFiles(f->f.getName().startsWith("."));//极简,只适用传一个参数的lambda表达式
            //过滤器lambda表达:自定义file要求得到名字开头有没有"."
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }//数组打印
        }
    }
}
