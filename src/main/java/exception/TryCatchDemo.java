package exception;

import java.sql.SQLOutput;

public class TryCatchDemo {
    public static void main(String[] args) {

        System.out.println("程序开始了");
        try {
//            String line = null;
            String line = "abc";
            System.out.println(line);
            System.out.println(Integer.parseInt(line));
            System.out.println(line.length());//有对象才能调方法,否则空指针异常
            System.out.println(line.charAt(2));
            System.out.println("!!!!!!!!");
//        }catch (NullPointerException e){
//            System.out.println("出现了空指针,并且解决了");
//        }catch (IndexOutOfBoundsException e){
//            if(e instanceof StringIndexOutOfBoundsException) {
//                System.out.println("出现了字符串下表越界,并且解决了");
//            }
        }catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println("出现了空指针或下标越界,并解决了");
        }catch (Exception e){
            System.out.println("反正就是出了个错");
        }
        System.out.println("程序结束了");
    }
}
