package Model_DAO;

import Model.Doctor;

import javax.print.Doc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class Doctor_DAO extends DAO<Doctor>  {

    ArrayList<Doctor> list_doctor()
    {
        ArrayList<Doctor> list = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Medecin";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int inami = resultSet.getInt("Inami");
                String name = resultSet.getString("Nom");
                String surname = resultSet.getString("Prenom");
                String spec = resultSet.getString("Specialisation");
                Doctor doctor = new Doctor(inami, name, surname, spec);
                list.add(doctor);
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
    }

    @Override
    public Doctor read(String id) throws Exception {
        return null;
    }

    @Override
    public Doctor create(Doctor obj) throws Exception {
        return null;
    }

    @Override
    public Doctor update(Doctor obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Doctor obj) throws Exception {

    }
}
