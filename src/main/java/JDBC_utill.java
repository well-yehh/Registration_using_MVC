import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_utill {
    public static Connection getDBConnection() throws SQLException{

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Registration_Servlet_data",
               "postgres",
               "March429April");
    }
}
