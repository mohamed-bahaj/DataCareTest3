package Model_DAO;

import Model.WoundSurveillance;

import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WoundSurveillance_DAO extends DAO<WoundSurveillance> {

    @Override
    public List<WoundSurveillance> read() {
        List<WoundSurveillance> listWoundSurveillance = new LinkedList<WoundSurveillance>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM surveillance_plaie");

            WoundSurveillance woundSurveillance = null;
            while(rs.next()){
                woundSurveillance = new WoundSurveillance();
                woundSurveillance.setId(rs.getInt("idSurveillance_plaie"));
                woundSurveillance.setSite(rs.getString("Site"));
                woundSurveillance.setType(rs.getString("Type"));
                woundSurveillance.setRougeur(rs.getBoolean("Rougeur"));
                woundSurveillance.setFibrine(rs.getBoolean("Fibrine"));
                woundSurveillance.setNecrose(rs.getBoolean("Necrose"));
                woundSurveillance.setExsudats(rs.getBoolean("Exsudats"));
                woundSurveillance.setPus(rs.getBoolean("Pus"));
                woundSurveillance.setOdeurs(rs.getBoolean("Odeur"));
                woundSurveillance.setInflammation(rs.getBoolean("Inflammation"));
                woundSurveillance.setMacerees(rs.getBoolean("Maceree"));
                woundSurveillance.setOedematiees(rs.getBoolean("Oedematiee"));
                woundSurveillance.setBourgeons(rs.getBoolean("Bourgeon"));
                woundSurveillance.setEpidermistion(rs.getBoolean("Epidermisation"));
                woundSurveillance.setEvnScore(rs.getInt("EVN_score"));
                woundSurveillance.setComment(rs.getString("Commentaire"));

                listWoundSurveillance.add(woundSurveillance);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listWoundSurveillance;
    }

    @Override
    public void create(WoundSurveillance obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO surveillance_plaie(idSurveillance_plaie,Site,Type,Rougeur,Fibrine, Necrose, Exsudats, Pus, Odeur, Inflammation, Maceree, Oedematiee, Bourgeon, Epidermisation, EVN_score, Commentaire) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setString(2,  obj.getSite());
            prepare.setString(3,obj.getType());
            prepare.setBoolean(4, obj.getRougeur() );
            prepare.setBoolean(5, obj.getFibrine());
            prepare.setBoolean(6, obj.getNecrose());
            prepare.setBoolean(7,obj.getExsudats());
            prepare.setBoolean(8, obj.getPus() );
            prepare.setBoolean(9, obj.getOdeurs());
            prepare.setBoolean(10, obj.getInflammation());
            prepare.setBoolean(11, obj.getMacerees());
            prepare.setBoolean(12,  obj.getOedematiees());
            prepare.setBoolean(13,obj.getBourgeons());
            prepare.setBoolean(14, obj.getEpidermistion() );
            prepare.setInt(15, obj.getEvnScore());
            prepare.setString(16, obj.getComment());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public WoundSurveillance update(WoundSurveillance obj) throws Exception {
        return null;
    }

    @Override
    public void delete(WoundSurveillance obj) throws Exception {

    }
}
