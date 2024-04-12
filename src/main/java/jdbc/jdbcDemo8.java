package jdbc;

import java.sql.*;

public class jdbcDemo8 {
    public static void main(String[] args) {
        User user = InputUtil.getInputObject(new User(),"","登录");
        try {
            Connection connection = DBUtil.getConnection();
            Statement state = connection.createStatement();//原先通过createStatement的对象执行executeQuery,会把定义和值进行拼接
            String sql = "select id username,password,nickname,age "+
                    "from userinfo "+
                    "where username = ? and password = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ResultSet rs = ps.executeQuery();//通过prepareStatement的对象执行executeQuery,定义已定死,只拼接值
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
