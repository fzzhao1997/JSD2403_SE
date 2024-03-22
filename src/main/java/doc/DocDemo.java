package doc;
/**
 * @author FangzhouZhao
 * @version 1.0
 * @see java.lang.String
 * @since JDK17
 */
public class DocDemo {
    /**
     * 说明常量作用
     */
    public static  final  String INF = "你好:";
    /**
     *
     * @param name 给定的用户名字(Stirng)      -解释参数的意义(传入参数格式等要求)
     * @return     带有问候语的字符串   -解释返回值是什么
     */
    public String sayHello(String name){
        return "你好:"+name;
    }
}
