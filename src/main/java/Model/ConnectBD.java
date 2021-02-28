package Model;

import com.mysql.jdbc.Connection;



import java.sql.DriverManager;

public class ConnectBD {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= (Connection) DriverManager.getConnection
                    ("jdbc:mysql://localhost:330/db_mvc?characterEncoding=latin1","root","zoubair");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}
