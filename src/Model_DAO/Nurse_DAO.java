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
            ResultSet rs = statement.executeQuery("SELECT * FROM Nurse");

            Nurse nurse = null;
            while(rs.next()){
                nurse = new Nurse();
                nurse.setInami(rs.getInt("Inami"));
                nurse.setName(rs.getString("Nom"));
                nurse.setLastName(rs.getString("Prenom"));
                nurse.setStatus(rs.getString("Statut"));
                nurse.setEmail(rs.getString("Email"));
                nurse.setPassword(rs.getString("mdp"));

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
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO Nurse(Inami,Nom,Prenom,Statut,Email, mdp) VALUES(?,?,?,?,?,?)");
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
        return null;
    }

    @Override
    public void delete(Nurse obj) throws Exception {

    }

}
