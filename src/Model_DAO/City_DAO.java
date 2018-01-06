package Model_DAO;

import Model.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class City_DAO extends DAO<City> {

    @Override
    public List<City> read() {
        List<City> listCity = new LinkedList<City>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ville");

            City city = null;
            while(rs.next()){
                city = new City();
                city.setId(rs.getInt("idVille"));
                city.setPostalCode(rs.getInt("CP"));
                city.setName(rs.getString("Nom"));
                city.setCountry(rs.getString("Pays"));

                listCity.add(city);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCity;
    }

    @Override
    public void create(City obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO ville(idVille,CP,Nom,Pays) VALUES(?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setInt(2,  obj.getPostalCode());
            prepare.setString(3,obj.getName());
            prepare.setString(4, obj.getCountry() );
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public City update(City obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE Ville SET `CP`= ?, `Nom`=?, `Pays`= ? WHERE `idVille`= ?");
            preparedStatement.setInt(1, obj.getPostalCode());
            preparedStatement.setString(2, obj.getName());
            preparedStatement.setString(3, obj.getCountry());
            preparedStatement.setInt(4, obj.getId());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(City obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM Ville WHERE `idVille`=?");
            preparedStatement.setInt(1, obj.getId());
            preparedStatement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
