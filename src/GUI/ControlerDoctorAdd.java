package GUI;

import Model.Doctor;
import Model_DAO.Doctor_DAO;
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
import java.util.List;
import java.util.ResourceBundle;

public class ControlerDoctorAdd implements Initializable {

    @FXML
    private AnchorPane anchorPaneAddDoctor;

    @FXML
    private JFXTextField fieldINAMI;

    @FXML
    private JFXTextField fieldName;

    @FXML
    private JFXTextField fieldLastName;

    @FXML
    private JFXTextField fieldWork;

    @FXML
    private JFXButton buttonBack;

    @FXML
    private JFXButton buttonAdd;

    @FXML
    private Label labelWorng;

    @FXML
    void addActionBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        ControlerMainView mainController =  (ControlerMainView)loader.getController();
        anchorPaneAddDoctor.getChildren().setAll(root);
    }

    @FXML
    void addActionSave(ActionEvent event) throws Exception {
        if(!fieldINAMI.getText().equals("")) {

            Doctor_DAO doctor_dao = new Doctor_DAO();
            List<Doctor> listDoctor = doctor_dao.read();
            boolean test = false;
            for(int i=0;i<listDoctor.size();i++){
                if(fieldINAMI.getText().equals(listDoctor.get(i).getInamiNumber())){
                    test=true;
                    labelWorng.setText("Ce numéro Inami est déjà utilisé");
                }
            }
            if(test == false) {
                Doctor doctor = new Doctor(Integer.parseInt(fieldINAMI.getText()), fieldName.getText(), fieldLastName.getText(), fieldWork.getText());
                doctor_dao.create(doctor);
                FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
                Parent root = (Parent) loader.load();
                anchorPaneAddDoctor.getChildren().setAll(root);
            }


            /**
             * Data has been sent to database. Now we switch to login window.
             **/

        }else{
            if (fieldINAMI.getText().equals("")){
                labelWorng.setText("Vous n'avez pas indiqué d'INAMI");
            }
        }
    }





    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
