package GUI;

import Model.Doctor;
import Model.Extern;
import Model.Nurse;
import Model.Patient;
import Model_DAO.Doctor_DAO;
import Model_DAO.Extern_DAO;
import Model_DAO.Nurse_DAO;
import Model_DAO.Patient_DAO;
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
    private MenuItem buttonAddNurse;

    @FXML
    private MenuItem buttonShowDoctor;

    @FXML
    private MenuItem buttonAddDoctor;

    @FXML
    private MenuItem buttonShowExtern;

    @FXML
    private MenuItem buttonAddExtern;

    @FXML
    private MenuItem buttonShowPatient;

    @FXML
    private MenuItem buttonAddPatient;

    @FXML
    private MenuItem buttonAddTreatment;

    @FXML
    void addActionAddDoctor(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/DoctorAddView.fxml"));
        Parent root = (Parent) loader.load();
        borderPaneMainView.getChildren().setAll(root);
    }

    @FXML
    void addActionAddExtern(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/externAddView.fxml"));
        Parent root = (Parent) loader.load();
        borderPaneMainView.getChildren().setAll(root);
    }

    @FXML
    void addActionAddPatient(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/patientAddView.fxml"));
        Parent root = (Parent) loader.load();
        borderPaneMainView.getChildren().setAll(root);
    }

    @FXML
    void addActionAddTreatment(ActionEvent event) {

    }

    @FXML
    void addActionShowDoctor(ActionEvent event) {
        Doctor_DAO doctor_dao = new Doctor_DAO();
        List<Doctor> listDoctor = doctor_dao.read();

        JFXListView<Label> listViewDoctor = new JFXListView<>();
        for(int i=0;i<listDoctor.size();i++){
            listViewDoctor.getItems().add(new Label(listDoctor.get(i).getInamiNumber() +"  "+ listDoctor.get(i).getName() +"  "+ listDoctor.get(i).getSurname() ));
        }
        borderPaneMainView.setCenter(listViewDoctor);

        listViewDoctor.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                listViewDoctor.getSelectionModel().getSelectedItem().getText();
                borderPaneMainView.setCenter(null);
                for(int i=0;i<listDoctor.size();i++){
                    if((listDoctor.get(i).getInamiNumber() +"  "+ listDoctor.get(i).getName() +"  "+ listDoctor.get(i).getSurname()).equals(listViewDoctor.getSelectionModel().getSelectedItem().getText())){
                        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/DoctorShowView.fxml"));
                        Parent root = null;
                        try {
                            root = (Parent) loader.load();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ControlerDoctorShow controlerDoctorShow =  (ControlerDoctorShow) loader.getController();
                        controlerDoctorShow.setText(listDoctor.get(i).getInamiNumber(),listDoctor.get(i).getName(),listDoctor.get(i).getSurname(),listDoctor.get(i).getSpecialisation());
                        borderPaneMainView.getChildren().setAll(root);
                    }
                }
            }
        });

    }

    @FXML
    void addActionShowExtern(ActionEvent event) {
        Extern_DAO extern_dao = new Extern_DAO();
        List<Extern> listExtern = extern_dao.read();

        JFXListView<Label> listViewExtern = new JFXListView<>();
        for(int i=0;i<listExtern.size();i++){
            listViewExtern.getItems().add(new Label(listExtern.get(i).getId() +"  "+ listExtern.get(i).getName() +"  "+ listExtern.get(i).getSurname() ));
        }
        borderPaneMainView.setCenter(listViewExtern);

        listViewExtern.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                listViewExtern.getSelectionModel().getSelectedItem().getText();
                borderPaneMainView.setCenter(null);
                for(int i=0;i<listExtern.size();i++){
                    if((listExtern.get(i).getId() +"  "+ listExtern.get(i).getName() +"  "+ listExtern.get(i).getSurname()).equals(listViewExtern.getSelectionModel().getSelectedItem().getText())){
                        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/externShowView.fxml"));
                        Parent root = null;
                        try {
                            root = (Parent) loader.load();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ControlerExternShow externControler =  (ControlerExternShow) loader.getController();
                        externControler.setText(listExtern.get(i).getId(),listExtern.get(i).getName(),listExtern.get(i).getSurname(),listExtern.get(i).getWork());
                        borderPaneMainView.getChildren().setAll(root);
                    }
                }
            }
        });
    }

    @FXML
    void addActionShowPatient(ActionEvent event) {
        Patient_DAO patient_dao = new Patient_DAO();
        List<Patient> listPatient = patient_dao.read();

        JFXListView<Label> listViewPatient = new JFXListView<>();
        for(int i=0;i<listPatient.size();i++){
            listViewPatient.getItems().add(new Label(listPatient.get(i).getName() +"  "+ listPatient.get(i).getSurname()));
        }
        borderPaneMainView.setCenter(listViewPatient);

        listViewPatient.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                listViewPatient.getSelectionModel().getSelectedItem().getText();
                borderPaneMainView.setCenter(null);
                for(int i=0;i<listPatient.size();i++){
                    if((listPatient.get(i).getName() +"  "+ listPatient.get(i).getSurname()).equals(listViewPatient.getSelectionModel().getSelectedItem().getText())){
                        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/patientShowView.fxml"));
                        Parent root = null;
                        try {
                            root = (Parent) loader.load();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ControlerPatientShow controlerPatientShow =  (ControlerPatientShow) loader.getController();
                        controlerPatientShow.setText(listPatient.get(i).getName(), listPatient.get(i).getSurname(),listPatient.get(i).getGender(), listPatient.get(i).getBirthday(), listPatient.get(i).getPhoneNumber(), listPatient.get(i).getTypeCare(), listPatient.get(i).getMedicalBackGround(), listPatient.get(i).getDiet(), listPatient.get(i).getFamilySituation(), listPatient.get(i).getDependance(), listPatient.get(i).getIdAdress());
                        borderPaneMainView.getChildren().setAll(root);
                    }
                }
            }
        });
    }

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

    @FXML
    void addActionAddNurse(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("GUI/signUpView.fxml"));
        Parent root = (Parent) loader.load();
        borderPaneMainView.getChildren().setAll(root);
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
