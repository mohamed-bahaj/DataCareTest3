package Model_DAO;

import Model.ResponsiblePerson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResponsiblePerson_DAO extends DAO<ResponsiblePerson> {

    /*ArrayList<ResponsiblePerson> list_responsiblePerson()
    {
        ArrayList<ResponsiblePerson> list = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM Titulaire";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("idTitulaire");
                String name = resultSet.getString("Nom");
                String surname = resultSet.getString("Prenom");
                Date birthday = resultSet.getDate("Date_naissance");
                int idPatient = resultSet.getInt("Patien_idPatient");
                ResponsiblePerson responsiblePerson = new ResponsiblePerson(id, name, surname, birthday, idPatient);
                list.add(responsiblePerson);
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
    public List<ResponsiblePerson> read() {
        return null;
    }

    @Override
    public void create(ResponsiblePerson obj) throws Exception {

    }

    @Override
    public ResponsiblePerson update(ResponsiblePerson obj) throws Exception {
        return null;
    }

    @Override
    public void delete(ResponsiblePerson obj) throws Exception {

    }
}
