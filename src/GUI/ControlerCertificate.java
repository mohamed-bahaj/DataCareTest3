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

public class ControlerCertificate implements Initializable {
    @FXML
    private AnchorPane anchorPaneCertificate;

    @FXML
    private Label labelName;

    @FXML
    private Label labelEmpty;

    @FXML
    private JFXTextField fieldDoctor;

    @FXML
    private JFXTextField fieldDuration;

    @FXML
    private JFXButton buttonAddCertificate;

    @FXML
    private JFXButton buttonBack;


    @FXML
    void AddCertificate(ActionEvent event) {

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

    }
}
