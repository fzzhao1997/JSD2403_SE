package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//关联查询
public class jdbcDemo6 {
    public static void main(String[] args) {
        //查询
        try (Connection connection = DBUtil.getConnection();
        ) {String sql = "select t.name,t.gender,c.name,c.floor "+
                "from teacher t "+
                "join class c " +
                "on c.teacher_id = t.id " +
                "where t.name = '王克晶'";
            Statement state = connection.createStatement();
            ResultSet r = state.executeQuery(sql);
            while (r.next()){
                String tname = r.getString("t.name");
                String tgender = r.getString("t.gender");
                String cname = r.getString("c.name");
                String cfloor = r.getString("c.floor");
                System.out.println(tname+"\t"+tgender+"\t"+cname+"\t"+cfloor);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
