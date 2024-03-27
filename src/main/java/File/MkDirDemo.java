package File;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {
        File dir  = new File("./demo/123/345/789");
        if(dir.exists()){
            System.out.println("该目录已存在");
        }else {
//            dir.mkdir();
            dir.mkdirs();
            System.out.println("该目录已创建");
        }
    }
}
