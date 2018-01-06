package Model_DAO;

import Model.Patient_Extern;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Patient_Extern_DAO extends DAO<Patient_Extern> {


    @Override
    public List<Patient_Extern> read() throws Exception {
        List<Patient_Extern> listPatientExtern = new LinkedList<Patient_Extern>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM patient_externe");

            Patient_Extern patient_extern = null;
            while(rs.next()){
                patient_extern = new Patient_Extern();
                patient_extern.setIdExtern(rs.getInt("Patient_idPatient"));
                patient_extern.setIdPatient(rs.getInt("Externe_idExterne"));

                listPatientExtern.add(patient_extern);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPatientExtern;
    }

    @Override
    public void create(Patient_Extern obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO patient_externe(Patient_idPatient,Externe_idExterne) VALUES(?,?)");
            prepare.setInt(1, obj.getIdPatient());
            prepare.setInt(2,  obj.getIdExtern());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Patient_Extern update(Patient_Extern obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Patient_Extern obj) throws Exception {
        try {
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE  FROM patient_externe where `Patient_idPatient` = ?");
            preparedStatement.setInt(1, obj.getIdPatient());
            preparedStatement.execute();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }


}
