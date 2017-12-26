package Model_DAO;

import Model.City;
import Model.ContactPerson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ContactPerson_DAO extends DAO<ContactPerson> {

    ArrayList<ContactPerson> list_ContactPerson()
    {
        ArrayList<ContactPerson> list = new ArrayList();

        try
        {
            String query = "SELECT * FROM Personne_Contact";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int phoneNumber = resultSet.getInt("Telephone");
                String name = resultSet.getString("Nom");
                String surname = resultSet.getString("Surname");
                String link = resultSet.getString("Lien");
                ContactPerson  contactPerson = new ContactPerson(phoneNumber, name, surname, link);
                list.add(contactPerson);
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
    public ContactPerson read(String id) throws Exception {
        return null;
    }

    @Override
    public ContactPerson create(ContactPerson obj) throws Exception {
        return null;
    }

    @Override
    public ContactPerson update(ContactPerson obj) throws Exception {
        return null;
    }

    @Override
    public void delete(ContactPerson obj) throws Exception {

    }
}
