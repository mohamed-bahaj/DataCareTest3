package Model_DAO;

import Model.Assistance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Assistance_DAO extends DAO<Assistance> {

    public ArrayList<Assistance> list_Assistance()
    {
        ArrayList<Assistance> list_Assistance = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Assistance";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("idAssistance");
                boolean toilet = resultSet.getBoolean("Toilette");
                boolean alimentation = resultSet.getBoolean("Alimentation");
                boolean medication = resultSet.getBoolean("Medication");
                boolean prepa = resultSet.getBoolean("Prepa_medi_cass");
                boolean elimination = resultSet.getBoolean("Elimination");
                boolean protection = resultSet.getBoolean("Protect_anatom");
                boolean friction = resultSet.getBoolean("Friction");
                boolean pansement = resultSet.getBoolean("Pansement");
                Assistance a = new Assistance(id, toilet, alimentation, medication, prepa, elimination, protection, friction, pansement);
                list_Assistance.add(a);

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

        return list_Assistance;
    }

    @Override
    public Assistance read(String id) throws Exception {
        return null;
    }

    @Override
    public Assistance create(Assistance obj) throws Exception {
        return null;
    }

    @Override
    public Assistance update(Assistance obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Assistance obj) throws Exception {

    }
}
