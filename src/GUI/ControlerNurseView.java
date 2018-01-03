package GUI;

import com.jfoenix.controls.JFXButton;
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
import java.util.ResourceBundle;

public class ControlerNurseView implements Initializable{

    @FXML
    private AnchorPane anchorPaneNurse;

    @FXML
    private JFXTextField fieldInami;

    @FXML
    private JFXTextField fieldNom;

    @FXML
    private JFXTextField fieldPrénom;

    @FXML
    private JFXTextField fieldEmail;

    @FXML
    private JFXTextField fieldStatut;

    @FXML
    private JFXButton buttonSave;

    @FXML
    private JFXButton buttonCancel;

    @FXML
    private JFXButton buttonDelete;

    @FXML
    private JFXButton buttonBack;

    @FXML
    private Label labelInami;

    @FXML
    private Label labelNom;

    @FXML
    private Label labelPrénom;

    @FXML
    private Label labelEmail;

    @FXML
    private Label labelStatut;

    public void setText(int inami,String name,String lastName,String email,String status){
        this.fieldInami.setText(Integer.toString(inami));
        this.fieldNom.setText(name);
        this.fieldPrénom.setText(lastName);
        this.fieldEmail.setText(email);
        this.fieldStatut.setText(status);
    }

    @FXML
    void addActionBack(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        ControlerMainView mainController =  (ControlerMainView)loader.getController();
        anchorPaneNurse.getChildren().setAll(root);

    }

    @FXML
    void addActionCancel(ActionEvent event) {

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
