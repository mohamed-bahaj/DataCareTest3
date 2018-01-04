package GUI;

import Model.Nurse;
import Model_DAO.Nurse_DAO;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
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

        listViewNurse.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                listViewNurse.getSelectionModel().getSelectedItem().getText();
                borderPaneMainView.setCenter(null);
                for(int i=0;i<listnurse.size();i++){
                    if((listnurse.get(i).getInami() +"  "+ listnurse.get(i).getName() +"  "+ listnurse.get(i).getLastName()).equals(listViewNurse.getSelectionModel().getSelectedItem().getText())){
                        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/NurseView.fxml"));
                        Parent root = null;
                        try {
                            root = (Parent) loader.load();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ControlerNurseView nurseControler =  (ControlerNurseView) loader.getController();
                        nurseControler.setText(listnurse.get(i).getInami(),listnurse.get(i).getName(),listnurse.get(i).getLastName(),listnurse.get(i).getEmail(),listnurse.get(i).getStatus());
                        borderPaneMainView.getChildren().setAll(root);
                    }
                }
            }
        });

    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
