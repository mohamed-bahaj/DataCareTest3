package GUI;

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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import sample.Controller;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlerSignUpView implements Initializable {

    private String userName;
    private String password;

    public ControlerSignUpView() {

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @FXML
    private AnchorPane paneSignUp;

    @FXML
    private JFXTextField fieldEmailSignUp;

    @FXML
    private JFXPasswordField fieldPasswordSignUp;

    @FXML
    private JFXPasswordField fieldPassword2SignUp;

    /*@FXML
    private JFXButton buttonSignUpConfirm;*/

    @FXML
    private JFXTextField fieldName;

    @FXML
    private JFXTextField fieldLastName;

    @FXML
    private JFXTextField fieldStatut;

    @FXML
    private JFXTextField fieldInami;


    @FXML
    private Label labelWrong2;


    @FXML
    private JFXButton buttonCancel;

    @FXML
    void addActionCancel(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("sample/sample.fxml"));
        Parent root = (Parent) loader.load();
        paneSignUp.getChildren().setAll(root);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    void addActionLogin2(ActionEvent event) throws IOException {
        if(!fieldEmailSignUp.getText().equals("") && !fieldInami.getText().equals("") && !fieldPasswordSignUp.getText().equals("") && !fieldPassword2SignUp.getText().equals("") && fieldPasswordSignUp.getText().equals(fieldPassword2SignUp.getText())) {

            Nurse_DAO nurseDao = new Nurse_DAO();
            List<Nurse> listnurse = nurseDao.read();
            boolean test = false;
            for(int i=0;i<listnurse.size();i++){
                if(fieldEmailSignUp.getText().equals(listnurse.get(i).getEmail()) || fieldInami.getText().equals(""+listnurse.get(i).getInami())){
                    test=true;
                    labelWrong2.setText("Ce numéro Inami ou cette adresse email est déjà utilisé.e");
                }
            }
            if(test == false) {
                Nurse nurse = new Nurse(Integer.parseInt(fieldInami.getText()), fieldName.getText(), fieldLastName.getText(), fieldStatut.getText(), fieldEmailSignUp.getText(), fieldPasswordSignUp.getText());
                nurseDao.create(nurse);
                FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("sample/sample.fxml"));
                Parent root = (Parent) loader.load();
                paneSignUp.getChildren().setAll(root);
            }


            /**
            * Data has been sent to database. Now we switch to login window.
             **/

        }else{
            if (fieldEmailSignUp.getText().equals("")){
                labelWrong2.setText("Vous n'avez pas indiqué d'adresse mail");
            }
            if (fieldPasswordSignUp.getText().equals("")){
                labelWrong2.setText("Vous n'avez pas indiqué de mot de passe");
            }
            if (!fieldPasswordSignUp.getText().equals(fieldPassword2SignUp.getText())){
                labelWrong2.setText("Les mots de passes sont différents");
            }
        }
    }
}



















