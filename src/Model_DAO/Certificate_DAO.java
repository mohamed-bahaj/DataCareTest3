package Model_DAO;

import Model.Certificate;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Certificate_DAO extends DAO<Certificate> {

    @Override
    public List<Certificate> read() {
        List<Certificate> listCertificate = new LinkedList<Certificate>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM certificat");

            Certificate certificate = null;
            while(rs.next()){
                certificate = new Certificate();
                certificate.setNumber(rs.getInt("idCertificat"));
                certificate.setTypeCare(rs.getBoolean("Type"));
                certificate.setStartingDate(rs.getDate("Date_debut"));
                certificate.setDuration(rs.getDate("Duree"));
                certificate.setTime(rs.getFloat("Heure"));
                certificate.setDatePrescription(rs.getDate("Date_prescription"));
                certificate.setDoctorInami(rs.getInt("Medecin_Inami"));
                certificate.setIdPatient(rs.getInt("Patient_idPatient"));

                listCertificate.add(certificate);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCertificate;
    }

    @Override
    public void create(Certificate obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO certificat(idCertificat,Type,Date_debut,Duree,Heure, Date_prescription,Medecin_Inami,Patient_idPatient) VALUES(?,?,?,?,?,?,?,?)");
            prepare.setInt(1, obj.getNumber());
            prepare.setBoolean(2,  obj.getTypeCare());
            prepare.setDate(3,obj.getStartingDate());
            prepare.setDate(4, obj.getDuration() );
            prepare.setFloat(5, obj.getTime());
            prepare.setDate(6, obj.getDatePrescription());
            prepare.setInt(7, obj.getDoctorInami());
            prepare.setInt(8, obj.getIdPatient());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Certificate update(Certificate obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE Certificat SET `Type` = ? , `Date_debut`= ?, `Duree`= ?, `Heure`= ?, `Date_prescription` = ? WHERE `idCertificat`= ? ");
            preparedStatement.setBoolean(1, obj.getTypeCare());
            preparedStatement.setDate(2, (java.sql.Date) obj.getStartingDate());
            preparedStatement.setDate(3, (java.sql.Date) obj.getDuration());
            preparedStatement.setFloat(4, obj.getTime());
            preparedStatement.setDate(5, (java.sql.Date) obj.getDatePrescription());
            preparedStatement.setInt(6, obj.getNumber());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Certificate obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM Certificat WHERE `idCertificat` = ?");
            preparedStatement.setInt(1, obj.getNumber());
            preparedStatement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
