package Model_DAO;

import Model.Extern;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Extern_DAO extends DAO<Extern>{

    ArrayList<Extern> list_extern()
    {
        ArrayList<Extern> list = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Externe";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("idExterne");
                String name = resultSet.getString("Nom");
                String surname = resultSet.getString("Prenom");
                String work = resultSet.getString("Profession");
                Extern extern = new Extern(id, name, surname, work);
                list.add(extern);
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
    public Extern read(String id) throws Exception {
        return null;
    }

    @Override
    public Extern create(Extern obj) throws Exception {
        return null;
    }

    @Override
    public Extern update(Extern obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Extern obj) throws Exception {

    }
}
