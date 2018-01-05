package Model_DAO;

import Model.City;
import Model.ContactPerson;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContactPerson_DAO extends DAO<ContactPerson> {

    @Override
    public List<ContactPerson> read() {
        List<ContactPerson> listContactPerson = new LinkedList<ContactPerson>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM personne_contact");

            ContactPerson contactPerson = null;
            while(rs.next()){
                contactPerson = new ContactPerson();
                contactPerson.setPhonenumber(rs.getInt("Telephone"));
                contactPerson.setName(rs.getString("Nom"));
                contactPerson.setSurname(rs.getString("Prenom"));
                contactPerson.setLink(rs.getString("Lien"));

                listContactPerson.add(contactPerson);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listContactPerson;
    }

    @Override
    public void create(ContactPerson obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO personne_contact(Telephone,Nom,Prenom,Lien) VALUES(?,?,?,?)");
            prepare.setInt(1, obj.getPhonenumber());
            prepare.setString(2,  obj.getName());
            prepare.setString(3,obj.getSurname());
            prepare.setString(4, obj.getLink() );
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public ContactPerson update(ContactPerson obj) throws Exception {
        return null;
    }

    @Override
    public void delete(ContactPerson obj) throws Exception {

    }
}
