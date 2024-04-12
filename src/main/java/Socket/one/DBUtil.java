package Socket.one;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//使用当前类管理数据库链接
public class DBUtil {
    private static DruidDataSource ds;//定义连接池引用
    static {
//        try {//当前类第一次加载时,将数据库驱动导入,驱动导入一次即可
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        ds = new DruidDataSource();//创建连接池对象
        ds.setUrl("jdbc:mysql://localhost:3306/tedu?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true");
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setInitialSize(5);//初始连接数
        ds.setMaxActive(10);//最大连接数
    }
    public static Connection getConnection() throws SQLException {
//       return DriverManager.getConnection(
//               "jdbc:mysql://localhost:3306/tedu?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
//               "root",
//               "root"
//       );
        return ds.getConnection();//返回连接池的一个空闲连接,若干连接池中没有连接的话,此方法会阻塞
        //外面用完连接,调用close方法相当于还连接,而不是把该链接真正关闭
    }
}
