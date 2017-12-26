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

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

    @FXML
    private JFXButton buttonSignUpConfirm;

    @FXML
    private Label labelWrong2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    void addActionLogin2(ActionEvent event) throws IOException {
        if(!fieldEmailSignUp.getText().equals("") && !fieldPasswordSignUp.getText().equals("") && !fieldPassword2SignUp.getText().equals("") && fieldPasswordSignUp.getText().equals(fieldPassword2SignUp.getText())) {
            userName = fieldEmailSignUp.getText();
            password = fieldPasswordSignUp.getText();
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




















