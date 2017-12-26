import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectTest {

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/DataCare";
        String username = "root";
        String password = "ltaPMP124@";

        System.out.println("Connecting database...");

        try (Connection connection = (Connection) DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
