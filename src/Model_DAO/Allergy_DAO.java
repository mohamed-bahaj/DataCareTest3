package Model_DAO;

import Model.Allergy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Allergy_DAO extends DAO<Allergy> {

    public ArrayList<Allergy> list_Allergy(){
        ArrayList<Allergy> list_Allergy = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Allergy";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                String nom = resultSet.getString("Nom");
                boolean type = resultSet.getBoolean("Type");
                Allergy a = new Allergy(nom, type);
                list_Allergy.add(a);
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


        return list_Allergy;
    }

    @Override
    public Allergy read(String id) throws Exception {
        return null;
    }

    @Override
    public Allergy create(Allergy obj) throws Exception {
        return null;
    }

    @Override
    public Allergy update(Allergy obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Allergy obj) throws Exception {

    }
}
