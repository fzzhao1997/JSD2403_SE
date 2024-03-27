package File;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            File file = new File("./test"+i+".txt");
            if(file.exists()){
                file.delete();
//                System.out.println("文件已删除");
            }else{
                System.out.println("文件test"+i+".txt不存在");
            }
            System.out.println("文件删除完毕");
        }
    }
}
