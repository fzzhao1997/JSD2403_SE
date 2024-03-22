package work.one;

public class Test04 {
    public static void main(String[] args) {
        String fileName = "123.png";

        boolean check = fileName.endsWith(".png");

        if(check) {
            System.out.println("是png图片!");
        }else {
            System.out.println("不是png图片!");
        }
    }
}
