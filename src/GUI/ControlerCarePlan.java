package GUI;

import Model.Assistance;
import Model.CarePlan;
import Model.Injection;
import Model.Perfusion;
import Model_DAO.Assistance_DAO;
import Model_DAO.CarePlan_DAO;
import Model_DAO.Injection_DAO;
import Model_DAO.Perfusion_DAO;
import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.List;
import java.util.ResourceBundle;

public class ControlerCarePlan implements Initializable {

    @FXML
    private AnchorPane anchorPanePlanCare;

    @FXML
    private JFXTextField fieldPatient;

    @FXML
    private JFXDatePicker dateCarePlanPicker;

    @FXML
    private JFXTextArea fieldComment;

    @FXML
    private JFXComboBox<String> comboInjection;

    @FXML
    private JFXRadioButton radioBed;

    @FXML
    private JFXRadioButton radioBassin;

    @FXML
    private JFXToggleButton toggleAlimentation;

    @FXML
    private JFXToggleButton toggleMedication;

    @FXML
    private JFXToggleButton toggleMediCassette;

    @FXML
    private JFXToggleButton toggleElimination;

    @FXML
    private JFXToggleButton togglePAnat;

    @FXML
    private JFXToggleButton toggleFriction;

    @FXML
    private JFXToggleButton toggleSticking;

    @FXML
    private JFXComboBox<String> comboTypePerfusion;

    @FXML
    private JFXTextField fieldQuantity;

    @FXML
    private JFXTextField fieldTime;

    @FXML
    private JFXComboBox<?> comboTTDouleur;

    @FXML
    private JFXButton buttonAddCare;

    @FXML
    private JFXButton buttonBack;

    @FXML
    private JFXToggleButton toggleToilet;

    @FXML
    void addActionAddCare(ActionEvent event) throws Exception {
        Injection_DAO injection_dao = new Injection_DAO();
        Injection injection = new Injection(comboTypePerfusion.getSelectionModel().getSelectedItem().toString());
        injection_dao.create(injection);

        Perfusion_DAO perfusion_dao = new Perfusion_DAO();
        Perfusion perfusion = new Perfusion();
        perfusion.setType(comboTypePerfusion.getSelectionModel().getSelectedItem().toString());
        perfusion.setQuantity(Float.parseFloat(fieldQuantity.getText()));
        perfusion.setTime(Float.parseFloat(fieldTime.getText()));
        perfusion_dao.create(perfusion);
        List<Perfusion> listPerfusion = perfusion_dao.read();

        for(int i=0;i<listPerfusion.size();i++){
            if(listPerfusion.get(i).getType().equals(perfusion.getType()) && listPerfusion.get(i).getQuantity() == perfusion.getQuantity() && listPerfusion.get(i).getTime() == perfusion.getTime()) {
                perfusion.setId(listPerfusion.get(i).getId());
                System.out.println(listPerfusion.get(i).getId());
            }
        }

        Assistance_DAO assistance_dao = new Assistance_DAO();
        Assistance assistance = new Assistance();
        boolean toilet = false;
        if(toggleToilet.isSelected()){toilet = true;}
        assistance.setToilet(toilet);
        boolean alimentation = false;
        if(toggleAlimentation.isSelected()){alimentation = true;}
        assistance.setAlimentation(alimentation);
        boolean med = false;
        if(toggleMedication.isSelected()){med = true;}
        assistance.setMedication(med);
        boolean medic = false;
        if(toggleMediCassette.isSelected()){medic = true; }
        assistance.setPreparationMD(medic);
        boolean elim = false;
        if(toggleElimination.isSelected()){elim = true; }
        assistance.setEliminations(elim);
        boolean anat = false;
        if(togglePAnat.isSelected()){anat= true;}
        assistance.setAnatomicProtections(anat);
        boolean friction = false;
        if(toggleFriction.isSelected()){friction= true;}
        assistance.setFrictions(friction);
        boolean sticking = false;
        if(toggleSticking.isSelected()){sticking = true; }
        assistance.setSticking(sticking);
        assistance_dao.create(assistance);

        List<Assistance> listAssistance = assistance_dao.read();

        for(int i=0;i<listAssistance.size();i++){
            if(listAssistance.get(i).getToilet() == assistance.getToilet() && listAssistance.get(i).getAlimentation() == assistance.getAlimentation() && listAssistance.get(i).getMedication() == assistance.getMedication() && listAssistance.get(i).getPreparationMD() == assistance.getPreparationMD() && listAssistance.get(i).getEliminations() == assistance.getEliminations() && listAssistance.get(i).getAnatomicProtections() == assistance.getAnatomicProtections() && listAssistance.get(i).getFrictions() == assistance.getFrictions() && listAssistance.get(i).getSticking() == assistance.getSticking()) {
                assistance.setId(listAssistance.get(i).getId());
                System.out.println(listAssistance.get(i).getId());
            }
        }


        CarePlan_DAO carePlan_dao = new CarePlan_DAO();
        Date date = Date.valueOf(dateCarePlanPicker.getValue());
        CarePlan carePlan = new CarePlan(date, fieldComment.getText(), injection.getType(), perfusion.getId(), assistance.getId(),1,1,1, 12345);
        carePlan_dao.create(carePlan);
    }

    @FXML
    void addActionBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        ControlerMainView mainController =  (ControlerMainView)loader.getController();
        anchorPanePlanCare.getChildren().setAll(root);
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboInjection.getItems().removeAll(comboInjection.getItems());
        comboInjection.getItems().addAll("IM","SC", "IVD");

        comboTypePerfusion.getItems().removeAll(comboTypePerfusion.getItems());
        comboTypePerfusion.getItems().addAll("intra_veineuse","SC");
    }
}
