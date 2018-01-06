package Model_DAO;

import Model.Extern;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Extern_DAO extends DAO<Extern>{

    /*ArrayList<Extern> list_extern()
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
    }*/


    @Override
    public List<Extern> read() {
        List<Extern> listExtern = new LinkedList<Extern>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM externe");

            Extern extern = null;
            while(rs.next()){
                extern = new Extern();
                extern.setId(rs.getInt("idExterne"));
                extern.setName(rs.getString("Nom"));
                extern.setSurname(rs.getString("Prenom"));
                extern.setWork(rs.getString("Profession"));

                listExtern.add(extern);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listExtern;
    }

    @Override
    public void create(Extern obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO externe(idExterne,Nom,Prenom,Profession) VALUES(?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setString(2,  obj.getName());
            prepare.setString(3,obj.getSurname());
            prepare.setString(4, obj.getWork() );
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Extern update(Extern obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE Externe SET `Nom`= ?, `Prenom`= ? , `Profession`= ? WHERE `idEXterne`= ?");
            preparedStatement.setString(1, obj.getName());
            preparedStatement.setString(2, obj.getSurname());
            preparedStatement.setString(3, obj.getWork());
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
    public void delete(Extern obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM Externe WHERE `idExterne` = ?");
            preparedStatement.setInt(1, obj.getId());
            preparedStatement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
