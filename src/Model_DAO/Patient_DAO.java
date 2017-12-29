package Model_DAO;

import Model.Patient;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient_DAO extends DAO<Patient> {

    /*ArrayList<Patient> list_patient()
    {
        ArrayList<Patient> list = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Patient";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("idPatient");
                String name = resultSet.getString("Nom");
                String surname = resultSet.getString("Prenom");
                boolean gender = resultSet.getBoolean("Sexe");
                Date birthday = resultSet.getDate("Date_naissance");
                int phone = resultSet.getInt("Telephone");
                boolean typeCare = resultSet.getBoolean("Type_soin");
                String background = resultSet.getString("Ant_med_chir");
                String diet = resultSet.getString("Regime");
                String situation = resultSet.getString("Situation_familiale");
                String dependance = resultSet.getString("Dependance");
                int idAdress = resultSet.getInt("Adresse_idAdresse");
                Patient patient = new Patient(id, name, surname, gender, birthday, phone, typeCare, background, diet, situation, dependance, idAdress);
                list.add(patient);
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
    public List<Patient> read() {
        return null;
    }

    @Override
    public void create(Patient obj) throws Exception {

    }

    @Override
    public Patient update(Patient obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Patient obj) throws Exception {

    }
}
