package sample;

import GUI.ControlerMainView;
import GUI.ControlerSignUpView;
import Model.Nurse;
import Model_DAO.Nurse_DAO;
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
import java.sql.*;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void initialize(URL location, ResourceBundle resources) {}

    public void addActionLogin(ActionEvent actionEvent) throws IOException {

        Nurse_DAO nurseDao = new Nurse_DAO();
        List<Nurse> listnurse = nurseDao.read();

        for(int i=0;i<listnurse.size();i++){
            if(fieldUserNameLogin.getText().equals(listnurse.get(i).getEmail()) && fieldPasswordLogin.getText().equals(listnurse.get(i).getPassword())){
                labelWrong.setText(null);
                FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
                Parent root = (Parent) loader.load();
                ControlerMainView mainController =  (ControlerMainView)loader.getController();
                paneLogin.getChildren().setAll(root);


            }else {
                labelWrong.setText("Le nom d'utilisateur ou le mot de passe est incorrect");
            }
        }


        fieldPasswordLogin.clear();
        fieldUserNameLogin.clear();

    }

    @FXML
    void addActionSignUp(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/signUpView.fxml"));
        Parent root = (Parent) loader.load();
        paneLogin.getChildren().setAll(root);
    }



}









