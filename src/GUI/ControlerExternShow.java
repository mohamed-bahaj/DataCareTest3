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
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControlerExternShow implements Initializable {

    @FXML
    private AnchorPane anchorPaneShowExtern;

    @FXML
    private JFXButton buttonBack;

    @FXML
    private JFXButton buttonSave;

    @FXML
    private JFXButton buttonDelete;

    @FXML
    private JFXTextField fieldID;

    @FXML
    private JFXTextField fieldName;

    @FXML
    private JFXTextField fieldLastName;

    @FXML
    private JFXTextField fieldWork;

    public void setText(int id,String name,String lastName,String work){
        this.fieldID.setText(Integer.toString(id));
        this.fieldName.setText(name);
        this.fieldLastName.setText(lastName);
        this.fieldWork.setText(work);
    }


    @FXML
    void addActionBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/mainView.fxml"));
        Parent root = (Parent) loader.load();
        ControlerMainView mainController =  (ControlerMainView)loader.getController();
        anchorPaneShowExtern.getChildren().setAll(root);
    }

    @FXML
    void addActionDelete(ActionEvent event) throws Exception {
        Extern_DAO extern_dao = new Extern_DAO();
        Extern extern = new Extern();
        extern.setId(Integer.parseInt(this.fieldID.getText()));
        extern_dao.delete(extern);
    }

    @FXML
    void addActionSave(ActionEvent event) throws Exception {
        Extern_DAO extern_dao = new Extern_DAO();
        Extern extern = new Extern();
        extern.setId(Integer.parseInt(this.fieldID.getText()));
        extern.setName(this.fieldName.getText());
        extern.setSurname(this.fieldLastName.getText());
        extern.setWork(this.fieldWork.getText());
        extern_dao.update(extern);
    }








    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
