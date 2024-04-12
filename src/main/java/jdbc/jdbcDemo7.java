package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo7 {
    public static void main(String[] args) {
        try (Connection connection = DBUtil.getConnection();){
            String sql = "select count(*) '人数' "+
                    "from class c "+
                    "join student s on s.class_id = c.id " +
                    "where c.name = '1年级1班'";
            Statement state = connection.createStatement();
            ResultSet r = state.executeQuery(sql);
            while (r.next()){
                int count = r.getInt("人数");//搜索的是别名
                System.out.println(count);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
