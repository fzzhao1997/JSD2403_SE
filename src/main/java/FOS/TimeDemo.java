package FOS;

public class TimeDemo {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time/1000/60/60/24/365+1970);
        System.out.println(Long.MAX_VALUE / 1000 / 60 / 60 / 24 / 365 + 2024);
    }
}
