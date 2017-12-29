package GUI;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    void addActionLogin2(ActionEvent event) throws IOException {
        if(!fieldEmailSignUp.getText().equals("") && !fieldPasswordSignUp.getText().equals("") && !fieldPassword2SignUp.getText().equals("") && fieldPasswordSignUp.getText().equals(fieldPassword2SignUp.getText())) {

            Connection con = null;
            PreparedStatement pst = null;

            try {

                int inami = Integer.parseInt(fieldInami.getText());
                String name = fieldName.getText();
                String lastname = fieldLastName.getText();
                String statut = fieldStatut.getText();
                String email = fieldEmailSignUp.getText();
                String mdp = fieldPasswordSignUp.getText();

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datacare","java","password");

                pst = con.prepareStatement("INSERT INTO Nurse(Inami,Nom,Prenom,Statut,Email, mdp) VALUES(?,?,?,?,?,?)");
                pst.setInt(1, inami);
                pst.setString(2, name);
                pst.setString(3, lastname);
                pst.setString(4, statut);
                pst.setString(5, email);
                pst.setString(6, mdp);
                pst.executeUpdate();

            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(ControlerSignUpView.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);

            } finally {

                try {

                    if (pst != null) {
                        pst.close();
                    }

                    if (con != null) {
                        con.close();
                    }

                } catch (SQLException ex) {

                    Logger lgr = Logger.getLogger(ControlerSignUpView.class.getName());
                    lgr.log(Level.SEVERE, ex.getMessage(), ex);
                }
            }

            /**
            * Data has been sent to database. Now we switch to login window.
             **/

            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("sample/sample.fxml"));
            Parent root = (Parent) loader.load();
            paneSignUp.getChildren().setAll(root);
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




















