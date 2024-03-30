package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String line = null;
//            String line = "123";
            System.out.println(line.length());
            return;
        }catch (Exception e){
            System.out.println("报错了");
        }finally {
            System.out.println("finally执行了");
        }
        System.out.println("程序结束");
    }
}
