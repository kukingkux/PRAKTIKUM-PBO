package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    private Connection con;
    private Statement stmt;
    private boolean isConnected;
    private String message;

    // Getter for message attribute
    public String getMessage() {
        return message;
    }

    public void connect() {
        String dbname = "praktikum";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbname, username, password);
            stmt = con.createStatement();
            isConnected = true;
            message = "DB connected";
        } catch (Exception e) {
            isConnected = false;
            message = e.getMessage();
        }
    }

    public void disconnect() {
        try {
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        } catch (Exception e) {
            message = e.getMessage();
        }
    }

    public void runQuery(String query) {
        try {
            connect();
            int result = stmt.executeUpdate(query);
            message = "info: " + result + " rows affected";
        } catch (Exception e) {
            message = e.getMessage();
        } finally {
            disconnect();
        }
    }

    public ResultSet getData(String query) {
    ResultSet rs = null;
    try {
        connect(); 
        rs = stmt.executeQuery(query);
    } catch (Exception e) {
        message = e.getMessage(); // Fixed: Put inside the catch block
    }
    return rs; 
    }
}