import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbUtil {
    public static final String URL = "jdbc:mysql://localhost:3306/imooc";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL,"root","root");
        Statement stm = conn.createStatement();



    }
}
