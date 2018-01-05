package Model_DAO;

import Model.Allergy;
import Model.TTDouleur;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TTDouleur_DAO extends DAO<TTDouleur> {

    @Override
    public List<TTDouleur> read() {
        List<TTDouleur> listTTDouleur = new LinkedList<TTDouleur>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM tt_douleur");

            TTDouleur ttDouleur = null;
            while(rs.next()){
                ttDouleur = new TTDouleur();
                ttDouleur.setId(rs.getInt("idTT_douleur"));
                ttDouleur.setPousseSeringue(rs.getBoolean("Pousse_seringue"));
                ttDouleur.setEcartPatch(rs.getFloat("Patch_heure_ecart"));
                ttDouleur.setSc(rs.getBoolean("SC"));
                ttDouleur.setIm(rs.getBoolean("IM"));

                listTTDouleur.add(ttDouleur);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listTTDouleur;
    }

    @Override
    public void create(TTDouleur obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO tt_douleur(idTT_douleur, Pousse_seringue, Patch_heure_ecart, SC, IM) VALUES(?,?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setBoolean(2,  obj.getPousseSeringue());
            prepare.setFloat(3,obj.getEcartPatch());
            prepare.setBoolean(4, obj.getSc() );
            prepare.setBoolean(5, obj.getIm());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public TTDouleur update(TTDouleur obj) throws Exception {
        return null;
    }

    @Override
    public void delete(TTDouleur obj) throws Exception {

    }
}
