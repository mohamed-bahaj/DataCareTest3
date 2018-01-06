package Model_DAO;

import Model.Assistance;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assistance_DAO extends DAO<Assistance> {

    @Override
    public List<Assistance> read() {
        List<Assistance> listAssistance = new LinkedList<Assistance>();
        try {
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM assistance");

            Assistance assistance = null;
            while(rs.next()){
                assistance = new Assistance();
                assistance.setId(rs.getInt("idAssistance"));
                assistance.setToilet(rs.getBoolean("Toilette"));
                assistance.setAlimentation(rs.getBoolean("Alimentation"));
                assistance.setMedication(rs.getBoolean("Medication"));
                assistance.setPreparationMD(rs.getBoolean("Prepa_medi_cass"));
                assistance.setEliminations(rs.getBoolean("Elimination"));
                assistance.setAnatomicProtections(rs.getBoolean("Protect_anatom"));
                assistance.setFrictions(rs.getBoolean("Friction"));
                assistance.setSticking(rs.getBoolean("Pansement"));

                listAssistance.add(assistance);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listAssistance;
    }

    @Override
    public void create(Assistance obj) throws Exception {
        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO assistance(idAssistance,Toilette,Alimentation, Medication, Prepa_medi_cass, Elimination, Protect_anatom, Friction, Pansement) VALUES(?,?,?,?,?,?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setBoolean(2,  obj.getToilet());
            prepare.setBoolean(3,  obj.getAlimentation());
            prepare.setBoolean(4,  obj.getMedication());
            prepare.setBoolean(5,  obj.getPreparationMD());
            prepare.setBoolean(6,  obj.getEliminations());
            prepare.setBoolean(7,  obj.getAnatomicProtections());
            prepare.setBoolean(8,  obj.getFrictions());
            prepare.setBoolean(9,  obj.getSticking());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Assistance update(Assistance obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE Assistance set `Toilette` = ?, `Alimentation` = ? , `Medication`= ?, `Prepa_medi_cass` = ? , `Elimination` = ? , `Protect_anatom` = ? ,`Friction`= ? , `Pansement` = ? WHERE `idAssistance` = ? ");
            preparedStatement.setBoolean(1, obj.getToilet());
            preparedStatement.setBoolean(2, obj.getAlimentation());
            preparedStatement.setBoolean(3, obj.getMedication());
            preparedStatement.setBoolean(4, obj.getMedication());
            preparedStatement.setBoolean(5, obj.getPreparationMD());
            preparedStatement.setBoolean(6, obj.getAnatomicProtections());
            preparedStatement.setBoolean(7, obj.getFrictions());
            preparedStatement.setBoolean(8, obj.getSticking());
            preparedStatement.setInt(9, obj.getId());
            preparedStatement.executeUpdate();

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Assistance obj) throws Exception {
        try
        {
            PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM Assistance WHERE `idAssistance`=?");
            preparedStatement.setInt(1, obj.getId());
            preparedStatement.execute();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

    }
}
