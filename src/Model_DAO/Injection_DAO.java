package Model_DAO;

import Model.Injection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Injection_DAO extends DAO<Injection> {

    ArrayList<Injection> list_injection()
    {
        ArrayList<Injection> list = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Injection";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                String type = resultSet.getString("Type_injection");
                Injection injection = new Injection(type);
                list.add(injection);
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
    public Injection read(String id) throws Exception {
        return null;
    }

    @Override
    public Injection create(Injection obj) throws Exception {
        return null;
    }

    @Override
    public Injection update(Injection obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Injection obj) throws Exception {

    }
}
