package GUI;

import Model.Certificate;
import Model_DAO.Certificate_DAO;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.List;
import java.util.ResourceBundle;

public class ControlerCertificate implements Initializable {
    @FXML
    private AnchorPane anchorPaneCertificate;

    @FXML
    private Label labelName;

    @FXML
    private Label labelEmpty;

    @FXML
    private JFXDatePicker datePrescription;

    @FXML
    private JFXComboBox<String> comboBoxType;

    @FXML
    private JFXDatePicker dateDebut;

    @FXML
    private JFXTextField fieldDoctor;

    @FXML
    private JFXTextField fieldDuration;

    @FXML
    private JFXButton buttonAddCertificate;

    @FXML
    private JFXButton buttonBack;

    @FXML
    private JFXTextField fieldTime;


    @FXML
    void AddCertificate(ActionEvent event) throws Exception {

        Certificate_DAO certificate_dao = new Certificate_DAO();
        List<Certificate> listCertificate = certificate_dao.read();
        boolean soin;
        if(comboBoxType.getSelectionModel().getSelectedItem().toString().equals("Plaies")){
            soin=true;
        }else
            soin=false;
        Date start = Date.valueOf(dateDebut.getValue());
        Date datePresc = Date.valueOf(datePrescription.getValue());

        Certificate certificate = new Certificate(soin, start, Float.parseFloat(fieldDuration.getText()), Float.parseFloat(fieldTime.getText()), datePresc, Integer.parseInt(fieldDoctor.getText()), 2);
        certificate_dao.create(certificate);
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        anchorPaneCertificate.getChildren().setAll(root);


    }

    @FXML
    void Back(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        ControlerMainView mainController =  (ControlerMainView)loader.getController();
        anchorPaneCertificate.getChildren().setAll(root);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBoxType.getItems().removeAll(comboBoxType.getItems());
        comboBoxType.getItems().addAll("Plaies","Diabète");
    }
}
