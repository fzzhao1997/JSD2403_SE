package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String>  c = new ArrayList<>();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        Iterator<String> it = c.iterator();
        while (it.hasNext()){//有没有下一个
            String e =  it.next();//
            if("#".equals(e)){//字面量在前面,避免null不能调方法,"#"在常量池可以调方法
                it.remove();//使用迭代器从本次迭代器c集合中删了,使用迭代器时不能使用集合,要通过迭代器的方法
            }
            //编历过程中删除#
            System.out.println(e);
        }
        System.out.println(c);
//        while (c.iterator().hasNext()){//这相当每次循环调用的新的迭代器,循环始终从头部开始
//            System.out.println(c.iterator().next());
//        }
//        int count=0;
//        while (count < 2){//这相当每次循环调用的新的迭代器,循环始终从头部开始
//            System.out.println(c.iterator().next());//相当于每次循环创建新迭代器下一个
//            count++;
//        }//调用迭代器方法，迭代器初始化为第一元素前面，输出一个重复为one
//        //需求随循环变化，并要记录的变量和方法，需在循环外储存
    }
}
