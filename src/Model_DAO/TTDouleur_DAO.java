package Model_DAO;

import Model.Allergy;
import Model.TTDouleur;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TTDouleur_DAO extends DAO<TTDouleur> {

    /*ArrayList<TTDouleur> list_TTDouleur()
    {
        ArrayList<TTDouleur> list = new ArrayList<>();

        try
        {
            String query = "SELECT * FROM TT_Douleur";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("idTT_douleur");
                boolean pousseSeringue = resultSet.getBoolean("Pousse_seringue");
                float ecartPatch = resultSet.getFloat("Patch_heure_ecart");
                boolean SC = resultSet.getBoolean("SC");
                boolean IM = resultSet.getBoolean("IM");
                TTDouleur ttDouleur = new TTDouleur(id, pousseSeringue, ecartPatch, SC, IM);
                list.add(ttDouleur);
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
    public List<TTDouleur> read() {
        return null;
    }

    @Override
    public void create(TTDouleur obj) throws Exception {

    }

    @Override
    public TTDouleur update(TTDouleur obj) throws Exception {
        return null;
    }

    @Override
    public void delete(TTDouleur obj) throws Exception {

    }
}
