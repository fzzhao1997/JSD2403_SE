package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo3 {
    public static void main(String[] args) {
        //将"王克晶"密码改为666666
        try (Connection connection = DBUtil.getConnection();
        ) {String sql = "update userinfo "+
                "set password = '6666666' "+
                "where username = '张三'";
            Statement state = connection.createStatement();
            int d = state.executeUpdate(sql);
            if(d>0){
                System.out.println("修改成功,共修改"+d+"条");
            }else {
                System.out.println("修改失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
