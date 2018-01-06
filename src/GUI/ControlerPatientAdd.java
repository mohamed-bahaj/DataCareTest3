package GUI;

import Model.Adress;
import Model.City;
import Model.Patient;
import Model_DAO.Adress_DAO;
import Model_DAO.City_DAO;
import Model_DAO.Patient_DAO;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.ZoneId;
import java.util.List;
import java.util.ResourceBundle;

public class ControlerPatientAdd implements Initializable{

    @FXML
    private AnchorPane anchorPaneAddPatient;

    @FXML
    private JFXTextField fieldNom;

    @FXML
    private JFXTextField fieldPrenom;

    @FXML
    private JFXComboBox<String> comboBoxSexe;

    @FXML
    private JFXDatePicker dateDateDeNaissance;

    @FXML
    private JFXTextField fieldTelephone;

    @FXML
    private JFXComboBox<String> comboBoxTypeSoin;

    @FXML
    private JFXTextArea fieldMedicalBackground;

    @FXML
    private JFXTextArea fieldRegime;

    @FXML
    private JFXTextField fieldFamille;

    @FXML
    private JFXTextField fieldDependance;

    @FXML
    private JFXTextField fieldPays;

    @FXML
    private JFXTextField fieldVille;

    @FXML
    private JFXTextField fieldCP;

    @FXML
    private JFXTextField fieldRue;

    @FXML
    private JFXTextField fieldNumero;

    @FXML
    private JFXTextField fieldBoite;

    @FXML
    private JFXButton buttonAddPatient;

    @FXML
    private JFXButton buttonBack;

    @FXML
    void addActionBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        ControlerMainView mainController =  (ControlerMainView)loader.getController();
        anchorPaneAddPatient.getChildren().setAll(root);
    }

    @FXML
    void addActionAddPatient(ActionEvent event) throws Exception {

        boolean sexe;
        if(comboBoxSexe.getSelectionModel().getSelectedItem().toString().equals("Homme")){
            sexe=true;
        }else
            sexe=false;

        boolean soin;
        if(comboBoxTypeSoin.getSelectionModel().getSelectedItem().toString().equals("Plaies")){
            soin=true;
        }else
            soin=false;

        Date date = Date.valueOf(dateDateDeNaissance.getValue());


        City_DAO city_dao = new City_DAO();
        List<City> listCity = city_dao.read();


        City city = new City(Integer.parseInt(fieldCP.getText()), fieldVille.getText(), fieldPays.getText());

        boolean cityTest =false;
        for(int i=0;i<listCity.size();i++) {
            if (listCity.get(i).getName().equals(city.getName()) && listCity.get(i).getPostalCode() == city.getPostalCode()) {
                cityTest = true;
            }
        }
        if(cityTest==false){
            city_dao.create(city);
        }

        Adress_DAO adress_dao = new Adress_DAO();
        List<Adress> listAdress = adress_dao.read();
        listCity = city_dao.read();

        for(int i=0;i<listCity.size();i++){
            if(listCity.get(i).getPostalCode() == city.getPostalCode() && listCity.get(i).getName().equals(city.getName())) {
                city.setId(listCity.get(i).getId());
            }
        }


        Adress adress = new Adress(fieldRue.getText(), Integer.parseInt(fieldNumero.getText()), fieldBoite.getText(), city.getId());

        boolean adresstest =false;
        for(int i=0;i<listAdress.size();i++) {
            if (listAdress.get(i).getStreet().equals(adress.getStreet()) && listAdress.get(i).getIdVille() == adress.getIdVille()) {
                adresstest = true;
            }
        }
        if(adresstest==false){
            adress_dao.create(adress);
        }




        listAdress = adress_dao.read();
        for(int i=0;i<listAdress.size();i++){
            if(listAdress.get(i).getStreet().equals(adress.getStreet()) && listAdress.get(i).getIdVille() == adress.getIdVille()) {
                adress.setId(listAdress.get(i).getId());
                System.out.println(adress.getId());
            }
        }


        Patient_DAO patient_dao = new Patient_DAO();
        List<Patient> listPatient = patient_dao.read();
        Patient patient = new Patient(fieldNom.getText(),fieldPrenom.getText(),sexe,date,Integer.parseInt(fieldTelephone.getText()),soin,fieldMedicalBackground.getText(),fieldRegime.getText(),fieldFamille.getText(),fieldDependance.getText(),adress.getId(),9999);
        boolean patientTest =false;
        for(int i=0;i<listPatient.size();i++) {
            if (listPatient.get(i).getName().equals(patient.getName()) && listPatient.get(i).getSurname().equals(patient.getSurname())) {
                patientTest = true;
            }
        }
        if(patientTest==false){
            patient_dao.create(patient);
        }

        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        anchorPaneAddPatient.getChildren().setAll(root);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBoxSexe.getItems().removeAll(comboBoxSexe.getItems());
        comboBoxSexe.getItems().addAll("Homme","Femme");
        //comboBoxSexe.getSelectionModel().select("Option B");

        comboBoxTypeSoin.getItems().removeAll(comboBoxTypeSoin.getItems());
        comboBoxTypeSoin.getItems().addAll("Plaies","Diabète");
    }
}
