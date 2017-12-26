package Model_DAO;

import Model.Certificate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class Certificate_DAO extends DAO<Certificate> {

    ArrayList<Certificate> list_certificate()
    {
        ArrayList<Certificate> list_certificate = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Certificate";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("idCertificat");
                boolean type = resultSet.getBoolean("Type");
                Date dateBegin = resultSet.getDate("Date_debut");
                Date duration = resultSet.getDate("Duree");
                float time = resultSet.getFloat("Heure");
                Date datePrescription = resultSet.getDate("Date_prescription");
                int inami = resultSet.getInt("Medecin_Inami");
                int idPatient = resultSet.getInt("Patient_idPatient");
                Certificate certificate = new Certificate(id, type, dateBegin, duration, time, datePrescription, inami, idPatient);
                list_certificate.add(certificate);
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

        return list_certificate;
    }

    @Override
    public Certificate read(String id) throws Exception {
        return null;
    }

    @Override
    public Certificate create(Certificate obj) throws Exception {
        return null;
    }

    @Override
    public Certificate update(Certificate obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Certificate obj) throws Exception {

    }
}
