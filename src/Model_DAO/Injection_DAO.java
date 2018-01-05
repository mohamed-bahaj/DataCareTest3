package Model_DAO;

import Model.Injection;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Injection_DAO extends DAO<Injection> {

    @Override
    public List<Injection> read() {
        List<Injection> listInjection = new LinkedList<Injection>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM injection");

            Injection injection = null;
            while(rs.next()){
                injection = new Injection();
                injection.setType(rs.getString("Type_injection"));

                listInjection.add(injection);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listInjection;
    }

    @Override
    public void create(Injection obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO injection(Type_injection) VALUES(?)");
            prepare.setString(1, obj.getType());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Injection update(Injection obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Injection obj) throws Exception {

    }
}
