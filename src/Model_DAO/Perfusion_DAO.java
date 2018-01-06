package Model_DAO;

import Model.Perfusion;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Perfusion_DAO extends DAO<Perfusion> {

    @Override
    public List<Perfusion> read() {
        List<Perfusion> listPerfusion = new LinkedList<Perfusion>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM perfusion");

            Perfusion perfusion = null;
            while(rs.next()){
                perfusion = new Perfusion();
                perfusion.setId(rs.getInt("idPerfusion"));
                perfusion.setType(rs.getString("Type"));
                perfusion.setQuantity(rs.getFloat("Quantite"));
                perfusion.setTime(rs.getFloat("Temps"));

                listPerfusion.add(perfusion);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPerfusion;
    }

    @Override
    public void create(Perfusion obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO perfusion(idPerfusion,Type,Quantite,Temps) VALUES(?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setString(2,  obj.getType());
            prepare.setFloat(3,obj.getQuantity());
            prepare.setFloat(4, obj.getTime());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Perfusion update(Perfusion obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE Perfusion SET `Type` =?, `Quantite` = ?, `Temps` = ? WHERE `idPerfusion` = ? ");
            preparedStatement.setString(1, obj.getType());
            preparedStatement.setFloat(2, obj.getQuantity());
            preparedStatement.setFloat(3, obj.getTime());
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
    public void delete(Perfusion obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("DELTE FROM Perfusion WHERE `idPerfusion` = ?");
            preparedStatement.setInt(1, obj.getId());
            preparedStatement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
