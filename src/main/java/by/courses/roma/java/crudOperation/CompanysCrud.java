package by.courses.roma.java.crudOperation;

import by.courses.roma.java.crudOperation.Crud;
import by.courses.roma.java.entity.Companys;

import java.sql.*;

public class CompanysCrud implements Crud<Companys> {


    public void create(Companys obj, Connection conn) {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO companys (name, members)" + " VALUES (?, ?)");

            ps.setString(1,obj.getName());

            ps.setInt(2,obj.getMembers());

            ps.execute();

            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public Companys read(int members, Connection conn) {
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM companys\n" + " WHERE members = ?");

            ps.setInt(1, members);

            ResultSet rs = ps.executeQuery();

            if (rs.next())

                return new Companys(rs.getString(1), members);

            rs.close();
            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;
    }

    public void update(Companys obj, Connection conn) {

        try {
            PreparedStatement ps = conn.prepareStatement(

                    " UPDATE companys\n" + "SET members = ?\n" + "WHERE name = ?");

            ps.setInt(1, obj.getMembers());

            ps.setString(2, obj.getName());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    public void delete(Companys obj, Connection conn) {

        try {

            PreparedStatement ps = conn.prepareStatement(" DELETE FROM companys WHERE name = ?");

            ps.setString(1,obj.getName());

            ps.execute();

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
