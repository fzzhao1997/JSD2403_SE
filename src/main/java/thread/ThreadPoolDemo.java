package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建一个容量为2的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);//fixed固定的
        for (int i = 0; i < 5; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread t = Thread.currentThread();
                        System.out.println(t.getName()+":正在执行任务...");
                        Thread.sleep(5000);
                        System.out.println(t.getName()+":执行任务完毕");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
            executorService.execute(runnable);
            System.out.println("将一个任务交给了线程池");
        }
//        executorService.shutdown();
        executorService.shutdownNow();
        //shutdownNow() 方法用于立即关闭线程池。调用 shutdownNow()
        // 方法后，线程池会尝试立即停止所有正在执行的任务，并且不再处理等待队列中的任务。
        //shutdown() 方法会使得 ExecutorService 不再接受新的任务提交
        // ，但会等待线程池中的所有任务执行完毕后关闭。
    }
}
