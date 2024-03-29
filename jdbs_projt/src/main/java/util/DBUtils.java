package util;

import java.sql.*;

public class DBUtils {
    public static final String DB_USER = "root";
    public static final String DB_PASS = "root";
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3308/users_db";
    private DBUtils (){

    }
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void release (Connection conn, Statement stmt, ResultSet rs){
        try {
            if (conn != null) {
                 System.out.println("Connection " + conn + "is closed");
                 conn.close();}
                if (stmt != null){
                    System.out.println("Connection " + stmt + "is closed");
                    stmt.close();

                }
            if (rs != null){
                System.out.println("Connection " + rs + "is closed");
                rs.close();
            }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

    }
}
