package Model_DAO;

import Model.Adress;
import com.sun.org.apache.regexp.internal.RE;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Adress_DAO extends DAO<Adress> {

    @Override
    public List<Adress> read() {
        List<Adress> listAdress = new LinkedList<Adress>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM adresse");

            Adress adress = null;
            while(rs.next()){
                adress = new Adress();
                adress.setId(rs.getInt("idAdresse"));
                adress.setStreet(rs.getString("Rue"));
                adress.setNumber(rs.getInt("Numero"));
                adress.setBox(rs.getString("Boite"));
                adress.setIdVille(rs.getInt("Ville_idVille"));

                listAdress.add(adress);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listAdress;
    }

    @Override
    public void create(Adress obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO Adresse(idAdresse,Rue,Numero,Boite, Ville_idVille) VALUES(?,?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setString(2,  obj.getStreet());
            prepare.setInt(3,obj.getNumber());
            prepare.setString(4, obj.getBox() );
            prepare.setInt(5, obj.getIdVille());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Adress update(Adress obj) throws Exception {

        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE adresse SET `Rue`= ?, `Numero`= ?, `Boite`= ? WHERE `idAdresse`= ?");
            preparedStatement.setString(1, obj.getStreet());
            preparedStatement.setInt(2, obj.getNumber());
            preparedStatement.setString(3, obj.getBox());
            preparedStatement.setInt(4, obj.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Adress obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM `adresse` WHERE `idAdresse`= ?");
            preparedStatement.setInt(1, obj.getId());
            preparedStatement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
