package by.courses.roma.java.connectionWithBD;

import by.courses.roma.java.crudOperation.CustomersCrud;
import by.courses.roma.java.entity.Customers;

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

    public static void main(String[] args){

        Customers user=new Customers(5,"Kate");

        Customers updateUser=new Customers(5,"Dima");

        CustomersCrud obj=new CustomersCrud();

        obj.create(user,connect());

        Customers readUser=obj.read(5,connect());

        System.out.println(readUser.toString());

        obj.update(updateUser,connect());

        obj.delete(updateUser,connect());


    }
}
