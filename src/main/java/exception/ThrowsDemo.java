package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {
    public void doSome() throws IOException, AWTException {
    }
}
class SubClass extends ThrowsDemo{
    //允许重写方法时不再抛出任何异常
//    public void doSome()  {
//    }
    //允许重写方法时仅抛出超类方法中声明的部分异常
//    public void doSome() throws IOException {
//    }
    //允许重写方法时抛出超类方法声明异常的子类型异常
//    public void doSome() throws FileNotFoundException {
//    }
    //不允许抛出额外异常(超类方法中没有声明的,并且与声明的异常没有继承关系的)
//    public void doSome() throws SQLException{}
    //不允许抛出超类方法声明抛出异常的超类型异常
//    public void doSome() throws Exception{}


    //子类重写父类的方法时，抛出的异常类型要小于等于父类方法声明的异常类型。
    // 这是因为子类方法的异常类型可以是父类方法异常类型的子类，这样做是为了保证代码的兼容性和一致性。
    // 如果子类方法抛出的异常类型比父类方法更大，可能会导致异常处理不当或者编译错误。
    //子类方法抛出的异常类型应该是父类方法抛出异常类型的子集，或者与父类方法抛出的异常类型相同。


}
