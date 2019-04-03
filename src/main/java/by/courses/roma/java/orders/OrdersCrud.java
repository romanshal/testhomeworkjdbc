package by.courses.roma.java.orders;

import by.courses.roma.java.crudOperation.Crud;

import java.sql.*;

public class OrdersCrud implements Crud<Orders> {

    public void create(Orders obj, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement("INSERT INTO orders (id, productid, customerid,createdat)" + " VALUES (?, ?, ?, ?)");

            ps.setInt(1,obj.getId());

            ps.setInt(2,obj.getProductId());

            ps.setInt(3,obj.getCostumerId());

            ps.setDate(4,obj.getCreateDat());

            ps.execute();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public Orders read(int id, Connection conn) {

        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM orders" + " WHERE id = ?");

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next())

                return new Orders(id, rs.getInt(1),rs.getInt(2),rs.getDate(3));

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;
    }

    public void update(Orders obj, Connection conn) {

        try {
            PreparedStatement ps = conn.prepareStatement(

                    " UPDATE orders\n" + "SET productid = ?,customerid = ?, createdat = ?\n" + "WHERE id = ?");


            ps.setInt(1, obj.getProductId());

            ps.setInt(2, obj.getCostumerId());

            ps.setDate(3, obj.getCreateDat());

            ps.setInt(4,obj.getId());

            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void delete(Orders obj, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement(" DELETE FROM orders WHERE id = ?");

            ps.setInt(1,obj.getId());

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
