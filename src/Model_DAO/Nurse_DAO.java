package Model_DAO;

import Model.Nurse;

import java.awt.geom.Area;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Nurse_DAO extends DAO<Nurse> {


    @Override
    public List<Nurse> read() {
        List<Nurse> listNurse = new LinkedList<Nurse>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM infirmiere");

            Nurse nurse = null;
            while(rs.next()){
                nurse = new Nurse();
                nurse.setInami(rs.getInt("Inami"));
                nurse.setName(rs.getString("Nom"));
                nurse.setLastName(rs.getString("Prenom"));
                nurse.setStatus(rs.getString("Statut"));
                nurse.setEmail(rs.getString("Email"));
                nurse.setPassword(rs.getString("motdepasse"));

                listNurse.add(nurse);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listNurse;
    }

    @Override
    public void create(Nurse obj) {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO infirmiere(Inami,Nom,Prenom,Statut,Email, motdepasse) VALUES(?,?,?,?,?,?)");
            prepare.setInt(1, obj.getInami());
            prepare.setString(2,  obj.getName());
            prepare.setString(3,obj.getLastName());
            prepare.setString(4, obj.getStatus() );
            prepare.setString(5, obj.getEmail());
            prepare.setString(6, obj.getPassword());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Nurse update(Nurse obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE infirmiere SET `Nom` = ?, `Prenom` = ?, `Statut` = ?, `email` = ?  WHERE `Inami` = ? ");
            preparedStatement.setString(1, obj.getName());
            preparedStatement.setString(2, obj.getLastName());
            preparedStatement.setString(3, obj.getStatus());
            preparedStatement.setString(4, obj.getEmail());
            preparedStatement.setInt(5, obj.getInami());
            preparedStatement.execute();

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Nurse obj) throws Exception {
        try {
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE  FROM Infirmiere where `Inami` = ?");
            preparedStatement.setInt(1, obj.getInami());
            preparedStatement.execute();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

}
