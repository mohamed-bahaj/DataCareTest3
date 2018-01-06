package Model_DAO;

import Model.Threatment;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Threatment_DAO extends DAO<Threatment> {

    @Override
    public List<Threatment> read() {
        List<Threatment> listThreatment = new LinkedList<Threatment>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM traitement");

            Threatment threatment = null;
            while(rs.next()){
                threatment = new Threatment();
                threatment.setDrug(rs.getString("Medicament"));
                listThreatment.add(threatment);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listThreatment;
    }

    @Override
    public void create(Threatment obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO traitement(Medicament) VALUES(?)");
            prepare.setString(1, obj.getDrug());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Threatment update(Threatment obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Threatment obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM Traitement WHERE `Medicament` =?");
            preparedStatement.setString(1, obj.getDrug());
            preparedStatement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
