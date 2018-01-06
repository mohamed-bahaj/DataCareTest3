package GUI;

import Model.Extern;
import Model_DAO.Extern_DAO;
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

public class ControlerExternAddView implements Initializable {

    @FXML
    private AnchorPane anchorPaneAddExtern;

    @FXML
    private JFXTextField fieldID;

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
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("sample/sample.fxml"));
        Parent root = (Parent) loader.load();
        anchorPaneAddExtern.getChildren().setAll(root);
    }

    @FXML
    void addActionSave(ActionEvent event) throws Exception {
        if(!fieldID.getText().equals("")) {

            Extern_DAO extern_dao = new Extern_DAO();
            List<Extern> listnurse = extern_dao.read();
            boolean test = false;
            for(int i=0;i<listnurse.size();i++){
                if(fieldID.getText().equals(listnurse.get(i).getId())){
                    test=true;
                    labelWorng.setText("Cet ID est déjà utilisé");
                }
            }
            if(test == false) {
                Extern extern = new Extern(Integer.parseInt(fieldID.getText()), fieldName.getText(), fieldLastName.getText(), fieldWork.getText());
                extern_dao.create(extern);
                FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
                Parent root = (Parent) loader.load();
                anchorPaneAddExtern.getChildren().setAll(root);
            }


            /**
             * Data has been sent to database. Now we switch to login window.
             **/

        }else{
            if (fieldID.getText().equals("")){
                labelWorng.setText("Vous n'avez pas indiqué d'ID");
            }
        }
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
