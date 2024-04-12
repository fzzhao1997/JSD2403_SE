package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo5 {
    public static void main(String[] args) {
        //查询
        try (Connection connection = DBUtil.getConnection();
        ) {String sql = "select id,salary,name,title from "+
                "teacher";
            Statement state = connection.createStatement();
            ResultSet r = state.executeQuery(sql);
            while (r.next()){
                int id = r.getInt("id");
                String salary = r.getString("salary");
                String name = r.getString("name");
                String title = r.getString("title");
                System.out.println(id+"\t"+salary+"\t"+name+"\t"+title);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
