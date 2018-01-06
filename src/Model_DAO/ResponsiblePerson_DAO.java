package Model_DAO;

import Model.ResponsiblePerson;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ResponsiblePerson_DAO extends DAO<ResponsiblePerson> {

    @Override
    public List<ResponsiblePerson> read() {
        List<ResponsiblePerson> listResponsiblePerson = new LinkedList<ResponsiblePerson>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM titulaire");

            ResponsiblePerson responsiblePerson = null;
            while(rs.next()){
                responsiblePerson = new ResponsiblePerson();
                responsiblePerson.setId(rs.getInt("idTitulaire"));
                responsiblePerson.setName(rs.getString("Nom"));
                responsiblePerson.setSurname(rs.getString("Prenom"));
                responsiblePerson.setBirthday(rs.getDate("Date_naissance"));
                responsiblePerson.setIdPatient(rs.getInt("Patient_idPatient"));

                listResponsiblePerson.add(responsiblePerson);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listResponsiblePerson;
    }

    @Override
    public void create(ResponsiblePerson obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO titulaire(idTitulaire,Nom,Prenom,Date_naissance,Patient_idPatient) VALUES(?,?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setString(2,  obj.getName());
            prepare.setString(3,obj.getSurname());
            prepare.setDate(4, obj.getBirthday() );
            prepare.setInt(5, obj.getIdPatient());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public ResponsiblePerson update(ResponsiblePerson obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE Titulaie SET `Nom` =?, `Prenom`= ?, `Date_naissance` =? WHERE `idTitulaire` = ?");
            preparedStatement.setString(1, obj.getName());
            preparedStatement.setString(2, obj.getSurname());
            preparedStatement.setDate(3, (java.sql.Date) obj.getBirthday());
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
    public void delete(ResponsiblePerson obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("DELTE FROM Titulaire WHERE `idTitulaire`= ? ");
            preparedStatement.setInt(1, obj.getId());
            preparedStatement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
