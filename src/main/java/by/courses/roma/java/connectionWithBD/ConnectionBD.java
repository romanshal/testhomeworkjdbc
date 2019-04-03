package by.courses.roma.java.connectionWithBD;

import java.sql.*;


public class ConnectionBD {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/Users";

    static final String USER = "postgres";

    static final String PASS = "Romaroma1421";

    public static Connection connect() {

        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (Exception e) {

            System.out.println("Problems with connection");

            e.printStackTrace();
        }
        return conn;
    }
}
