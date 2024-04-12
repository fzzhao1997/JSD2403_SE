package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //链接数据库
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2建立连接,url,user,psd
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/tedu?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root",
                "root"
        );
        System.out.println("与数据库建立连接!");
        //3.创建执行语句对象statement
        Statement state = connection.createStatement();
        String str = "create table userinfo("+
                "  id int primary key auto_increment, "+
                "username varchar(20), "+
                "password varchar(20), "+
                "nickname varchar(20), "+
                "age int(3)" +
                ")";
        //执行sql
        state.execute(str);//有返回值,只有产生查询值,才返回,true or false,但是dml和dql有专门执行语句
        System.out.println("执行完毕!");
        //关闭链接
        connection.close();
    }
}
