package work.one;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        System.out.println("请输入一个网址:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //截取域名
        int start = line.indexOf(".")+1;
        int end = line.indexOf(".",start);
        String name = line.substring(start,end);
        //判断域名是否为baidu
        if(name.equals("baidu")) {
            System.out.println("这是百度网站");
            //判断域名是否为tedu
        }else if(name.equals("tedu")) {
            System.out.println("这是达内网站");
        }else {
            System.out.println("这是其他网站");}

    }
}
