package GUI;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
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
    void addActionAddCare(ActionEvent event) {
        
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
