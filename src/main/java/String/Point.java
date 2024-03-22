package String;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.x = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//地址值一样,直接相等
        if (o == null || getClass() != o.getClass()) return false;//空或类型不一比不了,this.x默认0,this.y默认0
        Point point = (Point) o;//向下构造Object转Point,x,y才有Point中基本类型属性
        return x == point.x && y == point.y;//基本类型比较,值等就相等,
        // 在Java中，基本数据类型的变量是存储在栈内存中的。对于基本数据类型，变量直接存储的是值本身，而不是引用。因此，如果两个基本数据类型的变量的值相同，它们的(真实内存地址)也会相同。这是因为它们的值直接存储在栈内存中的相同位置。
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
