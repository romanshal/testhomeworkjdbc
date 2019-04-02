package by.courses.roma.java;

import java.sql.*;

public class FirstProject {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Users";

    static final String USER = "postgres";
    static final String PASS = "Romaroma1421";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM customers";
            ResultSet rs = stmt.executeQuery(sql);

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            //Handle errors for Class.forName
            System.out.println("Problems in Class.forName");
            e.printStackTrace();
        }
    }
}
