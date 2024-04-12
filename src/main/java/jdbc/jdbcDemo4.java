package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo4 {
    public static void main(String[] args) {
        //删除
        try (Connection connection = DBUtil.getConnection();
        ) {String sql = "delete from userinfo "+
                "where username = '1'";
            Statement state = connection.createStatement();
            int d = state.executeUpdate(sql);
            if(d>0){
                System.out.println("删除成功,共删除"+d+"条");
            }else {
                System.out.println("删除失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
