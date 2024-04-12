package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo9 {
    public static void main(String[] args) {
        User user = InputUtil.getInputObject(new User(),"欢迎注册","注册");
        try {
            Connection connection = DBUtil.getConnection();
            String sql = "insert into userinfo (username,password,nickname,age) "+
                    "values(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getNickname());
            ps.setInt(4,user.getAge());
            int d = ps.executeUpdate();
            //execute创建表或改表属性,返回是否执行
            //executeUpdate插入值,返回插入条数
            //executeQuery查询表,返回查询的对象
            if(d>0){
                System.out.println("注册成功,共插入"+d+"条");
            }else {
                System.out.println("注册失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
