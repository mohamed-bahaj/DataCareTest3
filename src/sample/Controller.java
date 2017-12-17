package sample;

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
    private JFXPasswordField fieldPassword;

    @FXML
    private JFXTextField fieldUserName;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void addActionLogin(ActionEvent actionEvent) throws IOException {
        if(fieldUserName.getText().equals("admin") && fieldPassword.getText().equals("admin")) {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        paneLogin.getChildren().setAll(root);
        }else{
            JOptionPane.showMessageDialog(null,"Wrong user name or password");
        }

    }





}












