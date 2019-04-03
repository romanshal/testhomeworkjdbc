package by.courses.roma.java.crudOperation;

import by.courses.roma.java.entity.Shop;
import java.sql.*;

public class ShopCrud implements Crud<Shop>{

    public void create(Shop obj, Connection conn) {

        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO shop (company, product)" + " VALUES (?, ?)");

            ps.setString(1,obj.getCompany());

            ps.setInt(2,obj.getProduct());

            ps.execute();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public Shop read(int id, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM shop" + " WHERE product = ?");

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next())

                return new Shop(rs.getString(1), id);

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;
    }

    public void update(Shop obj, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement(

                    " UPDATE shop\n" + "SET company = ?\n" + "WHERE product = ?");


            ps.setString(1, obj.getCompany());

            ps.setInt(2, obj.getProduct());

            ps.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void delete(Shop obj, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement(" DELETE FROM shop WHERE product = ?");

            ps.setInt(1,obj.getProduct());

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
