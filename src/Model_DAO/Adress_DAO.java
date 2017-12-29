package Model_DAO;

import Model.Adress;
import com.sun.org.apache.regexp.internal.RE;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Adress_DAO extends DAO<Adress> {

    /*public ArrayList<Adress> liste_Adress()
    {
        ArrayList<Adress> list_Adress = new ArrayList<>();

        try
        {
            String query= "SELECT * FROM Adress";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                int id = resultSet.getInt("idAdresse");
                String street = resultSet.getString("Rue");
                int number = resultSet.getInt("Numero");
                String box = resultSet.getString("Boite");
                int idVille = resultSet.getInt("Ville_idVille");
                Adress a =  new Adress(id, street, number, box, idVille);
                list_Adress.add(a);
            }
        }
        catch(SQLException e)
        {
            System.out.println(" Erreur SQL " + e);
        }
        catch (Exception e)
        {
            System.out.println(" Erreur : "+e);
            e.printStackTrace();
        }

        return list_Adress;
    }*/




    @Override
    public List<Adress> read() {
        return null;
    }

    @Override
    public void create(Adress obj) throws Exception {

    }

    @Override
    public Adress update(Adress obj) throws Exception {
        return null;
    }

    @Override
    public void delete(Adress obj) throws Exception {

    }
}
