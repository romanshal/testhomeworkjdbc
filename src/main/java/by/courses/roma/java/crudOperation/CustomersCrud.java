package by.courses.roma.java.crudOperation;

import by.courses.roma.java.crudOperation.Crud;
import by.courses.roma.java.entity.Customers;

import java.sql.*;

public class CustomersCrud implements Crud<Customers> {

    public void create(Customers obj, Connection conn) {

        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO customers (id, firstname)" + " VALUES (?, ?)");

            ps.setInt(1,obj.getId());

            ps.setString(2,obj.getFirstName());

            ps.execute();

            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public Customers read(int id, Connection conn) {

        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM customers" + " WHERE id = ?");

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next())

                return new Customers(id, rs.getString(1));

            rs.close();

            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }
        return null;
    }

    public void update(Customers obj, Connection conn) {

        try {
            PreparedStatement ps = conn.prepareStatement(

                    " UPDATE customers\n" + "SET firstname = ?\n" + "WHERE id = ?");


            ps.setString(1, obj.getFirstName());

            ps.setInt(2, obj.getId());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    public void delete(Customers obj, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement(" DELETE FROM customers WHERE id = ?");

            ps.setInt(1,obj.getId());

            ps.execute();

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
