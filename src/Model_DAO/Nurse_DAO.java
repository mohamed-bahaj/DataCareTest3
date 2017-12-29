package Model_DAO;

import Model.Nurse;

import java.awt.geom.Area;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Nurse_DAO extends DAO<Nurse> {

    ArrayList<Nurse> list_nurse()
    {
        ArrayList<Nurse> list = new ArrayList<>();

        try
        {
            //String query = "SELECT * FROM Infirmiere";
            String query = "SELECT * FROM Nurse";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int inami = resultSet.getInt("Inami");
                String name = resultSet.getString("Nom");
                String surname = resultSet.getString("Prenom");
                String status = resultSet.getString("Statut");
                Nurse nurse = new Nurse(inami, name, surname, status);
                list.add(nurse);
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
    public Nurse read(String id) throws Exception {
        return null;
    }

    @Override
    public Nurse create(Nurse obj) throws Exception {
        return null;
    }

    @Override
    public Nurse update(Nurse obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Nurse obj) throws Exception {

    }
}
