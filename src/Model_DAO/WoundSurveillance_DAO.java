package Model_DAO;

import Model.WoundSurveillance;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WoundSurveillance_DAO extends DAO<WoundSurveillance> {

    /*ArrayList<WoundSurveillance> list_woundSurveillance()
    {
        ArrayList<WoundSurveillance> list = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Surveillance_plaie";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("idSurveillance_plaie");
                String site = resultSet.getString("Site");
                String type = resultSet.getString("Type");
                boolean rougeur = resultSet.getBoolean("Rougeur");
                boolean fibrine = resultSet.getBoolean("Fibrine");
                boolean necrose = resultSet.getBoolean("Necrose");
                boolean exsudats = resultSet.getBoolean("Exsudats");
                boolean pus = resultSet.getBoolean("Pus");
                boolean odeur = resultSet.getBoolean("Odeur");
                boolean inflammation = resultSet.getBoolean("Inflammation");
                boolean maceree = resultSet.getBoolean("Maceree");
                boolean oedematiee = resultSet.getBoolean("Oedematiee");
                boolean bourgeon = resultSet.getBoolean("Bourgeon");
                boolean epidermisation = resultSet.getBoolean("Epidermisation");
                int EVNScore = resultSet.getInt("EVN_score");
                String com = resultSet.getString("Commentaire");
                WoundSurveillance woundSurveillance = new WoundSurveillance(id, site, type, rougeur, fibrine, necrose, exsudats, pus, odeur, inflammation, maceree, oedematiee, bourgeon, epidermisation, EVNScore, com);
                list.add(woundSurveillance);
            }
        }
        catch (SQLException e)
        {
            System.out.println(" Erreur SQL "+ e);
        }
        catch (Exception e)
        {
            System.out.println(" Erreur "+ e);
            e.printStackTrace();
        }

        return list;
    }*/


    @Override
    public List<WoundSurveillance> read() {
        return null;
    }

    @Override
    public void create(WoundSurveillance obj) throws Exception {

    }

    @Override
    public WoundSurveillance update(WoundSurveillance obj) throws Exception {
        return null;
    }

    @Override
    public void delete(WoundSurveillance obj) throws Exception {

    }
}
