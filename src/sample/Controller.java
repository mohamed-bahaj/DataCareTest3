package sample;

import GUI.ControlerSignUpView;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private AnchorPane paneLogin;

    @FXML
    private JFXButton buttonLogin;

    @FXML
    private JFXTextField fieldUserNameLogin;

    @FXML
    private JFXPasswordField fieldPasswordLogin;

    @FXML
    private Label labelWrong;

    @FXML
    private JFXButton buttonSignUp;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void addActionLogin(ActionEvent actionEvent) throws IOException {
        if(fieldUserNameLogin.getText().equals("admin") && fieldPasswordLogin.getText().equals("admin")) {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
            Parent root = (Parent) loader.load();
            paneLogin.getChildren().setAll(root);
        }else{
            labelWrong.setText("Le nom d'utilisateur ou le mot de passe est incorrect");
        }
    }

    @FXML
    void addActionSignUp(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/signUpView.fxml"));
        Parent root = (Parent) loader.load();
        paneLogin.getChildren().setAll(root);
    }



}












