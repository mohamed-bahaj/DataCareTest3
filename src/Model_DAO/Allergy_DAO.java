package Model_DAO;

import Model.Allergy;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Allergy_DAO extends DAO<Allergy> {

    @Override
    public List<Allergy> read() {
        List<Allergy> listAllergy = new LinkedList<Allergy>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM allerg_fa");

            Allergy allergy = null;
            while(rs.next()){
                allergy = new Allergy();
                allergy.setName(rs.getString("Nom"));
                allergy.setType(rs.getBoolean("Type"));
                listAllergy.add(allergy);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listAllergy;
    }

    @Override
    public void create(Allergy obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO allerg_fa(Nom,Type) VALUES(?,?)");
            prepare.setString(1, obj.getName());
            prepare.setBoolean(2,  obj.getType());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Allergy update(Allergy obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE allerg_fa SET `Type`=? WHERE `Nom`=?");
            preparedStatement.setBoolean(1, obj.getType());
            preparedStatement.setString(2, obj.getName());
            preparedStatement.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Allergy obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM allerg_fa WHERE `Nom`=?");
            preparedStatement.setString(1, obj.getName());
            preparedStatement.execute();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

    }
}
