package main.org.example.util;

import java.sql.*;

public class DBUtils {



        public static final String DB_USER = "root";
        public static final String DB_PASS = "";
        public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/users_db";

        private DBUtils() {

        }

        public static Connection getConnection() {
            try {
                return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

        public static void release(Connection conn, Statement stmt, ResultSet rs) {
            if (conn != null) {
                System.out.println("Connection " + conn + " is closed ");
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Statement " + stmt + " is closed ");
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Result " + rs + " is closed ");
            }
        }

    }

