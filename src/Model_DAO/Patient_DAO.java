package Model_DAO;

import Model.Patient;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Patient_DAO extends DAO<Patient> {

    @Override
    public List<Patient> read() {
        List<Patient> listPatient = new LinkedList<Patient>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM patient");

            Patient patient = null;
            while(rs.next()){
                patient = new Patient();
                patient.setId(rs.getInt("idPatient"));
                patient.setName(rs.getString("Nom"));
                patient.setSurname(rs.getString("Prenom"));
                patient.setGender(rs.getBoolean("Sexe"));
                patient.setBirthday(rs.getDate("Date_naissance"));
                patient.setPhoneNumber(rs.getInt("Telephone"));
                patient.setTypeCare(rs.getBoolean("Type_soin"));
                patient.setMedicalBackGround(rs.getString("Ant_med_chir"));
                patient.setDiet(rs.getString("Regime"));
                patient.setFamilySituation(rs.getString("Situation_familiale"));
                patient.setDependance(rs.getString("Dependance"));
                patient.setIdAdress(rs.getInt("Adresse_idAdresse1"));
                patient.setIdTitulaire(rs.getInt("Titulaire_idTitulaire"));

                listPatient.add(patient);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPatient;
    }

    @Override
    public void create(Patient obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO patient(idPatient,Nom,Prenom,Sexe,Date_naissance, Telephone, Type_soin, Ant_med_chir, Regime, Situation_familiale, Dependance, Adresse_idAdresse1,Titulaire_idTitulaire) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setString(2,  obj.getName());
            prepare.setString(3,obj.getSurname());
            prepare.setBoolean(4, obj.getGender() );
            prepare.setDate(5, obj.getBirthday());
            prepare.setInt(6, obj.getPhoneNumber());
            prepare.setBoolean(7, obj.getTypeCare());
            prepare.setString(8,  obj.getMedicalBackGround());
            prepare.setString(9,obj.getDiet());
            prepare.setString(10, obj.getFamilySituation() );
            prepare.setString(11, obj.getDependance());
            prepare.setInt(12, obj.getIdAdress());
            prepare.setInt(13, obj.getIdTitulaire());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Patient update(Patient obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE Patient SET `Nom` = ?, `Prenom`= ?, `Sexe` = ?, `Date_naissance` =?, `Telephone`=?, `Type_soin`= ?, `Ant_med_chir` = ?, `Regime`= ? , `Situation_familiale`=?, `Dependance`=?  WHERE `idPatient` = ?");
            preparedStatement.setString(1, obj.getName());
            preparedStatement.setString(2, obj.getSurname());
            preparedStatement.setBoolean(3, obj.getGender());
            preparedStatement.setDate(4, (java.sql.Date) obj.getBirthday());
            preparedStatement.setInt(5, obj.getPhoneNumber());
            preparedStatement.setBoolean(6, obj.isTypeCare());
            preparedStatement.setString(7, obj.getMedicalBackGround());
            preparedStatement.setString(8, obj.getDiet());
            preparedStatement.setString(9, obj.getFamilySituation());
            preparedStatement.setString(10, obj.getDependance());
            preparedStatement.setInt(11, obj.getId());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Patient obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM Patient WHERE `idPatient` = ?");
            preparedStatement.setInt(1, obj.getId());
            preparedStatement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
