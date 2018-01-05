package Model_DAO;

import Model.Doctor;

import javax.print.Doc;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Doctor_DAO extends DAO<Doctor>  {




    @Override
    public List<Doctor> read() {
        List<Doctor> listDoctor = new LinkedList<Doctor>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM medecin");

            Doctor doctor = null;
            while(rs.next()){
                doctor = new Doctor();
                doctor.setInamiNumber(rs.getInt("Inami"));
                doctor.setName(rs.getString("Nom"));
                doctor.setSurname(rs.getString("Prenom"));
                doctor.setSpecialisation(rs.getString("Specialisation"));

                listDoctor.add(doctor);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listDoctor;
    }

    @Override
    public void create(Doctor obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO medecin(Inami,Nom,Prenom,Specialisation) VALUES(?,?,?,?)");
            prepare.setInt(1, obj.getInamiNumber());
            prepare.setString(2,  obj.getName());
            prepare.setString(3,obj.getSurname());
            prepare.setString(4, obj.getSpecialisation());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Doctor update(Doctor obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Doctor obj) throws Exception {

    }
}
