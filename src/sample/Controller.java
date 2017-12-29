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
import java.sql.*;
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

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/datacare";
        String user = "java";
        String password = "password";

        try {

            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM Nurse");
            rs = pst.executeQuery();

            while (rs.next()) {

                /*System.out.print(rs.getInt(1));
                System.out.print(": ");
                System.out.println(rs.getString(2) + " " + rs.getString(3));*/

                if(fieldUserNameLogin.getText().equals(rs.getString(5)) && fieldPasswordLogin.getText().equals(rs.getString(6))){
                    labelWrong.setText(null);
                    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
                    Parent root = (Parent) loader.load();
                    paneLogin.getChildren().setAll(root);
                }else{
                    labelWrong.setText("Le nom d'utilisateur ou le mot de passe sont incorrects");
                }
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(Controller.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {

                if (rs != null) {
                    rs.close();
                }

                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(Controller.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
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












