package thread;

public class Bank {
    private int account = 20000;

    public synchronized boolean getMoney(int money) {//锁上,,只有一个线程能进方法,同步方法:多个线程不可以同步访问这个方法
        int sum = getAccount();
        if (sum >= money) {
            sum -= money;//进来后sum就不变了
            Thread.yield();//主动放弃剩余时间片,一个线程只停止一次
            saveMoney(sum);
            return true;
        }
        return false;
    }

    public int getAccount() {
        return account;
    }

    public void saveMoney(int save) {
        this.account = save;
    }
}
