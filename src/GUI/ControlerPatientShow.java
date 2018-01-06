package GUI;

import Model.Adress;
import Model.City;
import Model_DAO.Adress_DAO;
import Model_DAO.City_DAO;
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

public class ControlerPatientShow implements Initializable {

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
    private JFXButton buttonDelete;

    @FXML
    private JFXButton buttonSave;

    @FXML
    private JFXButton buttonBack;

    public void setText(String name, String surname, boolean gender, Date birthday, int phoneNumber, boolean typeCare, String medicalBackGround, String diet, String familySituation, String dependance, int idAdress) {
        this.fieldNom.setText(name);
        this.fieldPrenom.setText(surname);
        this.comboBoxSexe.getItems().removeAll(comboBoxSexe.getItems());
        this.comboBoxSexe.getItems().addAll("Homme","Femme");
        if(gender == true ) {
            this.comboBoxSexe.getSelectionModel().select("Homme");
        }
        else
            this.comboBoxSexe.getSelectionModel().select("Femme");
        this.dateDateDeNaissance.setValue(birthday.toLocalDate());
        this.fieldTelephone.setText(phoneNumber+"");
        this.comboBoxTypeSoin.getItems().removeAll(comboBoxTypeSoin.getItems());
        this.comboBoxTypeSoin.getItems().addAll("Plaies","Diabète");
        if(gender == true ) {
            this.comboBoxTypeSoin.getSelectionModel().select("Plaies");
        }
        else
            this.comboBoxTypeSoin.getSelectionModel().select("Diabète");
        this.fieldMedicalBackground.setText(medicalBackGround);
        this.fieldRegime.setText(diet);
        this.fieldFamille.setText(familySituation);
        this.fieldDependance.setText(dependance);
        Adress_DAO adress_dao = new Adress_DAO();
        List<Adress> listAdress = adress_dao.read();
        City_DAO city_dao = new City_DAO();
        List<City> listCity = city_dao.read();
        Adress adress = new Adress();
        City city = new City();
        for (int i=0;i<listAdress.size();i++){
            if (listAdress.get(i).getId() == idAdress){
                adress=listAdress.get(i);
                for (int j=0;j<listCity.size();j++){
                    if(listCity.get(j).getId() == adress.getIdVille()){
                        city=listCity.get(j);
                    }
                }
            }
        }
        this.fieldPays.setText(city.getCountry());
        this.fieldVille.setText(city.getName());
        this.fieldCP.setText(city.getPostalCode()+"");
        this.fieldRue.setText(adress.getStreet());
        this.fieldNumero.setText(adress.getNumber()+"");
        this.fieldBoite.setText(adress.getBox()+"");

    }


    @FXML
    void addActionBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        ControlerMainView mainController =  (ControlerMainView)loader.getController();
        anchorPaneAddPatient.getChildren().setAll(root);
    }

    @FXML
    void addActionDelete(ActionEvent event) {

    }

    @FXML
    void addActionSave(ActionEvent event) {

    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
