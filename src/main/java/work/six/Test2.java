package work.six;

import java.io.*;
import java.util.Arrays;

/**
 * 将当前目录下的所有obj文件获取到，并进行
 * 反序列化后输出每个用户的信息(直接输出反序
 * 列化后的User对象即可)
 *
 * @author Xiloer
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".obj");
            }
        });//是的话装进去
        for (File file1 : files) {
            FileInputStream inputFile = new FileInputStream("./" + file1.getName());//在字符串中调用方法
            System.out.println(file1.getName());
            InputStreamReader userFile = new InputStreamReader(inputFile);
            BufferedReader userAddress = new BufferedReader(userFile);
            String line;
            while ((line = userAddress.readLine()) != null) {
                System.out.println(line);
            }
            userAddress.close();
            userFile.close();
            inputFile.close();
        }
    }
}
