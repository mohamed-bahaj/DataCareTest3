package GUI;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControlerDoctorShow implements Initializable{

    @FXML
    private AnchorPane anchorPaneDoctor;

    @FXML
    private JFXButton buttonSave;

    @FXML
    private JFXButton buttonDelete;

    @FXML
    private JFXButton buttonBack;

    @FXML
    private JFXTextField fieldInami;

    @FXML
    private JFXTextField fieldName;

    @FXML
    private JFXTextField fieldSurname;

    @FXML
    private JFXTextField fieldSpecialisation;

    public void setText(int inami,String name,String lastName,String specialisation) {
        this.fieldInami.setText(Integer.toString(inami));
        this.fieldName.setText(name);
        this.fieldSurname.setText(lastName);
        this.fieldSpecialisation.setText(specialisation);
    }

    @FXML
    void addActionBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        ControlerMainView mainController =  (ControlerMainView)loader.getController();
        anchorPaneDoctor.getChildren().setAll(root);
    }

    @FXML
    void addActionDelete(ActionEvent event) {

    }

    @FXML
    void addActionSave(ActionEvent event) {

    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}