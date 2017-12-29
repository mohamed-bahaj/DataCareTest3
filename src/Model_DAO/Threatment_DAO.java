package Model_DAO;

import Model.Threatment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Threatment_DAO extends DAO<Threatment> {

    /*ArrayList<Threatment> list_threatment()
    {
        ArrayList<Threatment> list = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Traitement";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                String drug = resultSet.getString("Medicament");
                Threatment threatment = new Threatment(drug);
                list.add(threatment);
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
    public List<Threatment> read() {
        return null;
    }

    @Override
    public void create(Threatment obj) throws Exception {

    }

    @Override
    public Threatment update(Threatment obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Threatment obj) throws Exception {

    }
}
