package jdbc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
//        User user = InputUtil.getInputObject(new User(),"","登录");
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择登录或注册");
        String line = sc.nextLine();
        String str;
        if(line.trim().equals("登录")){
            str = "欢迎登录";
        }else {
            str = "欢迎注册";
        }
        //输入整合
        User user = InputUtil.getInputObject(new User(),str,line);
        try(Connection connection = DBUtil.getConnection();) {//DBUtil来自自定义类
            Statement state = connection.createStatement();
            String sql = "select id,username,password,nickname,age "+
                    "from userinfo "+
                    "where username = '"+user.getUsername()+"' "+
                    "and password = '"+user.getPassword()+"'";
            System.out.println(sql);
            ResultSet rs = state.executeQuery(sql);
            if(rs.next()){
                System.out.println("登录成功");
            }else {
                System.out.println("登录失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
