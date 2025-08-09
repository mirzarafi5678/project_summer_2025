package com.example.finalproject_oop213.MirzaMdSufianHridoy.TicketAgentController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.CreatePassengerTicket;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.PutObjectInBinFileOrTxtFile;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RemovePassengerTicketPgaeController {
    @javafx.fxml.FXML
    private TableColumn<CreatePassengerTicket,String> passengernamecolumn;
    @javafx.fxml.FXML
    private TextField PutIdTF;
    @javafx.fxml.FXML
    private TableColumn <CreatePassengerTicket,String>tripnumbercolumn;
    @javafx.fxml.FXML
    private TableColumn<CreatePassengerTicket,String> cargospacecolumn;
    @javafx.fxml.FXML
    private Label StatusShow;
    @javafx.fxml.FXML
    private TableColumn <CreatePassengerTicket,String>numberofseatcolumn;
    @javafx.fxml.FXML
    private TableColumn <CreatePassengerTicket,String>totalpricecolumn1;
    @javafx.fxml.FXML
    private TableView <CreatePassengerTicket>tableview;
    @javafx.fxml.FXML
    private TableColumn<CreatePassengerTicket,String> seattypecolumn;
    @javafx.fxml.FXML
    private TableColumn <CreatePassengerTicket,String>contactnumbercolumn;

    Alert aa= new Alert(Alert.AlertType.ERROR);
    @javafx.fxml.FXML
    private TableColumn<CreatePassengerTicket,String> IdColumn;

    @javafx.fxml.FXML
    void initialize(){
        passengernamecolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("nametf"));
        contactnumbercolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("contactnumber"));
        totalpricecolumn1.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("yourtotalprice"));
        numberofseatcolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("numberofseat"));
        seattypecolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("seattype"));
        cargospacecolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("cargosapce"));
        tripnumbercolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("tripnumber"));
        IdColumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("setid"));
    }


    @javafx.fxml.FXML
    public void DashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/ticketagent/TicketAgent-Dashboard-page.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void loadButton(ActionEvent actionEvent) {
        tableview.getItems().clear();
        aa.setContentText("Database is empty");
        File f = new File("CreatedByCounter.bin");
        if (f.exists()){try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                tableview.getItems().add((CreatePassengerTicket)ois.readObject());
            }
        }
        catch(Exception e){
            //
        }
        }else {
            aa.show();
        }
    }

    @javafx.fxml.FXML
    public void removeButton(ActionEvent actionEvent) {

        if (PutIdTF.getText().isEmpty()){
            aa.setContentText("Please put passenger id");
            aa.show();
            return;
        }


        boolean remove=PutObjectInBinFileOrTxtFile.removeParticularObjectFromBinFile("CreatedByCounter.bin",
                obj -> obj instanceof CreatePassengerTicket && ((CreatePassengerTicket) obj).getSetid() == Integer.parseInt(PutIdTF.getText()));


        if (remove){
               StatusShow.setWrapText(true);
               StatusShow.setText("Successfully removed the passenger's all data from database. ");

        }else {
            StatusShow.setWrapText(true);
            StatusShow.setText("Passender's data is not in the database. ");
        }


    }
}
