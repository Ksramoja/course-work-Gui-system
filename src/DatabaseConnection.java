import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static final String URL = "jdbc:ucanaccess://C:/Users/COLLINZ/Desktop/couse-work-java.laccdb";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
