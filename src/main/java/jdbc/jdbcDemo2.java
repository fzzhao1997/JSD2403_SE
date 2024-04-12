package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcDemo2 {
    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入用户名");
//        String username = sc.nextLine();
//        System.out.println("请输入密码");
//        String password = sc.nextLine();
//        System.out.println("请输入昵称");
//        String nickname = sc.nextLine();
//        System.out.println("请输入年龄");
//        int age=Integer.parseInt(sc.nextLine()) ;
        User user = InputUtil.getInputObject(new User());
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2建立连接,url,user,psd
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/tedu?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
                "root",
                "root"
        );
        Statement state = connection.createStatement();
        String sql = "insert into userinfo(username,password,nickname,age) "+
                "values('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getNickname()+"','"+user.getAge()+"')";
        int d = state.executeUpdate(sql);//返回影响表内影响记录的条数
        if(d>0){
            System.out.println("插入成功,影响了表内"+d+"条记录");
        }
        connection.close();
    }
}
