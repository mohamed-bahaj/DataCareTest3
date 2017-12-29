package Model_DAO;

import Model.City;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class City_DAO extends DAO<City> {

    /*ArrayList<City> list_city()
    {
        ArrayList<City> list_city = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM City";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("idVille");
                int postCode = resultSet.getInt("CP");
                String name = resultSet.getString("Nom");
                String country = resultSet.getString("Pays");
                City city = new City(id, postCode, name, country);
                list_city.add(city);
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

        return list_city;
    }*/


    @Override
    public List<City> read() {
        return null;
    }

    @Override
    public void create(City obj) throws Exception {

    }

    @Override
    public City update(City obj) throws Exception {
        return null;
    }

    @Override
    public void delete(City obj) throws Exception {

    }
}
