package sample;

import GUI.ControlerMainView;
import GUI.ControlerSignUpView;
import Model.*;
import Model_DAO.*;
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
    void addActionSignUp(ActionEvent event) throws IOException,Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/signUpView.fxml"));
        Parent root = (Parent) loader.load();
        paneLogin.getChildren().setAll(root);

        /*System.out.println("debut");
        Certificate_DAO doctor_dao = new Certificate_DAO();
        List<Certificate> listDoctor = doctor_dao.read();
        //System.out.println(listAssistance.get(0).getName() + "  " + listAllergy.get(0).getType());
        Certificate doctor = new Certificate(11,false,"2017-04-13","2017-04-18",3.0f,"2017-04-13",1239,);
        doctor_dao.create(doctor);
        System.out.println("debut");*/

        /*System.out.println("debut");
        City_DAO doctor_dao = new City_DAO();
        List<City> listDoctor = doctor_dao.read();
        City doctor = new City(7000,7000,"Mons","Belgique");
        doctor_dao.create(doctor);
        System.out.println("debut");*/
    }



}









