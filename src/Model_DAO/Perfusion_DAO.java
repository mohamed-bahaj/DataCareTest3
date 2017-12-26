package Model_DAO;

import Model.Perfusion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Perfusion_DAO extends DAO<Perfusion> {

    ArrayList<Perfusion> list_perfusion()
    {
        ArrayList<Perfusion> list = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Perfusion";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("idPerfusion");
                String type = resultSet.getString("Type");
                float quantity = resultSet.getFloat("Quantite");
                float time = resultSet.getFloat("Temps");
                Perfusion perfusion = new Perfusion(id, type, quantity, time);
                list.add(perfusion);
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
    }

    @Override
    public Perfusion read(String id) throws Exception {
        return null;
    }

    @Override
    public Perfusion create(Perfusion obj) throws Exception {
        return null;
    }

    @Override
    public Perfusion update(Perfusion obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Perfusion obj) throws Exception {

    }
}
