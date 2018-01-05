package Model_DAO;

import Model.CarePlan;

import java.awt.font.NumericShaper;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CarePlan_DAO extends DAO<CarePlan> {

    @Override
    public List<CarePlan> read() {
        List<CarePlan> listCarePlan = new LinkedList<CarePlan>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM plan_soin");

            CarePlan carePlan = null;
            while(rs.next()){
                carePlan = new CarePlan();
                carePlan.setId(rs.getInt("idPlan_soin"));
                carePlan.setDate(rs.getDate("Date"));
                carePlan.setComment(rs.getString("Commentaire"));
                carePlan.setInjection(rs.getString("Injection_Type_injection"));
                carePlan.setIdPerfusion(rs.getInt("Perfusion_idPerfusion"));
                carePlan.setIdAssistance(rs.getInt("Assistance_idAssistance"));
                carePlan.setIdWoundSurveillance(rs.getInt("Surveillance_plaie_idSurveillance_plaie"));
                carePlan.setIdTTDouleur(rs.getInt("TT_douleur_idTT_douleur"));
                carePlan.setNurseInami(rs.getInt("Infirmiere_Inami"));

                listCarePlan.add(carePlan);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCarePlan;
    }

    @Override
    public void create(CarePlan obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO plan_soin(idPlan_soin,Date,Commentaire,Injection_Type_injection,Perfusion_idPerfusion, Assistance_idAssistance, Surveillance_plaie_idSurveillance_plaie, TT_douleur_idTT_douleur,Infirmiere_Inami) VALUES(?,?,?,?,?,?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setDate(2,  obj.getDate());
            prepare.setString(3,obj.getComment());
            prepare.setString(4, obj.getInjection() );
            prepare.setInt(5, obj.getIdPerfusion());
            prepare.setInt(6, obj.getIdAssistance());
            prepare.setInt(7, obj.getIdWoundSurveillance() );
            prepare.setInt(8, obj.getIdTTDouleur());
            prepare.setInt(9, obj.getNurseInami());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public CarePlan update(CarePlan obj) throws Exception {
        return null;
    }

    @Override
    public void delete(CarePlan obj) throws Exception {

    }
}
