package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
//       Runnable r1 = new Runnable() {
//           @Override
//           public void run() {
//               for (int i = 0; i < 100; i++) {
//                   System.out.println("你过来啊");
//               }
//           }
//       };
       Runnable r2 =  new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 100; i++) {
                   System.out.println("得加钱");
               }
           }
       };//匿名内部类派生类没有名字,是通过向上造型创建的对象
        Thread t1 = new Thread(){//Thread的匿名内部类
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("你过来啊");
                }
            }
        };//任务放线程
        Thread t2 = new Thread(()->{for (int i = 0; i < 100; i++) {
            System.out.println("得加钱");
        }});//()->{方法}把Runnable改成lambda表达式,因为Runnable只有一个抽象方法
        //()->{}相当于runnable void run方法重写,并传进Thread
        t1.start();//启动线程
        t2.start();
        Runnable R = ()-> {
            for (int i = 0; i < 100; i++) {
                System.out.println("得加钱");
            }
        };//只有抽象方法简写,略去new对象,只留()并指向->{};{};里重写方法名删去,留下具体内容
    }
}
