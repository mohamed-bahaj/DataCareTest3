package Model_DAO;

import Model.CarePlan;

import java.awt.font.NumericShaper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class CarePlan_DAO extends DAO<CarePlan> {

    ArrayList<CarePlan> list_Care_Plan()
    {
        ArrayList<CarePlan> listCarePlan = new ArrayList<>();
        try
        {
            String query = "SELECT * FROM Plan_soin ";
            Statement statement = dbConnect.createStatement();
            ResultSet resultSet;
            resultSet =statement.executeQuery(query);

            while(resultSet.next())
            {
                int id = resultSet.getInt("idPlan_soin");
                Date date = resultSet.getDate("Date0");
                String com = resultSet.getString("Commentaire");
                String type_injection = resultSet.getString("Injection_Type_injection");
                int id_perfusion = resultSet.getInt("Perfusion_idPerfusion");
                int id_assistance = resultSet.getInt("Assistance_idAssistance");
                int id_surveillance = resultSet.getInt("Surveillance_plaie_idSurveillance_plaie");
                int id_TTDouleur = resultSet.getInt("TT_douleur_idTT_douleur");
                int inami = resultSet.getInt("Infirmiere_inami");
                CarePlan carePlan = new CarePlan(id, date, com, type_injection, id_perfusion, id_assistance, id_surveillance, id_TTDouleur, inami);
                listCarePlan.add(carePlan);
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
        return listCarePlan;
    }

    @Override
    public CarePlan read(String id) throws Exception {
        return null;
    }

    @Override
    public CarePlan create(CarePlan obj) throws Exception {
        return null;
    }

    @Override
    public CarePlan update(CarePlan obj) throws Exception {
        return null;
    }

    @Override
    public void delete(CarePlan obj) throws Exception {

    }
}
