package File;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <=100 ; i++) {
            File file = new File("./test"+i+".txt");//./可以省略,默认从项目根目录创建
            if(file.exists()){
                System.out.println("文件test"+i+".txt已存在");
            }else{
                file.createNewFile();
//                System.out.println("文件已创建");
            }
        }
        System.out.println("创建完毕");
    }
}
