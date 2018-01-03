package GUI;

import Model.Nurse;
import Model_DAO.Nurse_DAO;
import com.jfoenix.controls.JFXListView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ControlerMainView implements Initializable {

    @FXML
    private BorderPane borderPaneMainView;

    @FXML
    private MenuItem buttonVoirInfirmiere;

    @FXML
    void actionVoirInfirmiere(ActionEvent event) {
        Nurse_DAO nurseDao = new Nurse_DAO();
        List<Nurse> listnurse = nurseDao.read();

        JFXListView<Label> listViewNurse = new JFXListView<>();
        for(int i=0;i<listnurse.size();i++){
            listViewNurse.getItems().add(new Label(listnurse.get(i).getInami() +"  "+ listnurse.get(i).getName() +"  "+ listnurse.get(i).getLastName() ));
        }

        borderPaneMainView.setCenter(listViewNurse);


        //listViewNurse.getSelectionModel().getSelectedItems().addListener(new );
        listViewNurse.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                listViewNurse.getSelectionModel().getSelectedItems();
            }
        });
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
