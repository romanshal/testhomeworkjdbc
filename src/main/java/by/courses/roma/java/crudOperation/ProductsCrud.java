package by.courses.roma.java.crudOperation;

import by.courses.roma.java.entity.Products;

import java.sql.*;

public class ProductsCrud implements Crud<Products>{

    public void create(Products obj, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement("INSERT INTO products (id, productname, productcount,price)" + " VALUES (?, ?, ?, ?)");

            ps.setInt(1,obj.getId());

            ps.setString(2,obj.getProductName());

            ps.setInt(3,obj.getProductCount());

            ps.setInt(4,obj.getPrice());

            ps.execute();

            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public Products read(int id, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM products" + " WHERE id = ?");

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next())

                return new Products(id, rs.getString(2),rs.getInt(3),rs.getInt(4));

            rs.close();

            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;
    }

    public void update(Products obj, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement(

                    " UPDATE products\n" + "SET productname = ?, productcount = ?, price = ?\n" + "WHERE id = ?");


            ps.setString(1, obj.getProductName());

            ps.setInt(2, obj.getProductCount());

            ps.setInt(3, obj.getPrice());

            ps.setInt(4,obj.getId());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void delete(Products obj, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement(" DELETE FROM products WHERE id = ?");

            ps.setInt(1,obj.getId());

            ps.execute();

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
