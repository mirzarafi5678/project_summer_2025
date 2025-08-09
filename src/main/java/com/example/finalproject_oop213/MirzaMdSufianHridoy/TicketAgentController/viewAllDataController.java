package com.example.finalproject_oop213.MirzaMdSufianHridoy.TicketAgentController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.CreatePassengerTicket;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.LaunchTrip;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class viewAllDataController {

    @javafx.fxml.FXML
    private TextField spacenumberTF;
    @javafx.fxml.FXML
    private TableColumn <CreatePassengerTicket,String>passengernamecolumn;
    @javafx.fxml.FXML
    private TableColumn <CreatePassengerTicket,String>tripnumbercolumn;
    @javafx.fxml.FXML
    private TableColumn <CreatePassengerTicket,String>cargospacecolumn;
    @javafx.fxml.FXML
    private Label showtotalbook;
    @javafx.fxml.FXML
    private TableColumn<CreatePassengerTicket,String> numberofseatcolumn;
    @javafx.fxml.FXML
    private TableView <CreatePassengerTicket>tableview;
    @javafx.fxml.FXML
    private Label nameshow;
    @javafx.fxml.FXML
    private TableColumn <CreatePassengerTicket,String>contactnumbercolumn;
    @javafx.fxml.FXML
    private TableColumn<CreatePassengerTicket,String> totalpricecolumn1;
    @javafx.fxml.FXML
    private TableColumn<CreatePassengerTicket,String> seattypecolumn;
    Alert aa= new Alert(Alert.AlertType.ERROR);
    @javafx.fxml.FXML
    private TableColumn <CreatePassengerTicket,String>GenderColumn;

    @javafx.fxml.FXML

//    public String  nametf,tripnumber,gender,seattype;
//    public  int setid,cargosapce,numberofseat,contactnumber;
//    public LaunchTrip obj=null;
//    public int yourtotalprice=0;


    void initialize(){
        passengernamecolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("nametf"));
        contactnumbercolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("contactnumber"));
        totalpricecolumn1.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("yourtotalprice"));
        numberofseatcolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("numberofseat"));
        seattypecolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("seattype"));
        cargospacecolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("cargosapce"));
        tripnumbercolumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("tripnumber"));
        GenderColumn.setCellValueFactory(new PropertyValueFactory<CreatePassengerTicket,String>("gender"));



    }


    @javafx.fxml.FXML
    public void totalbookedbutton(ActionEvent actionEvent) {
        int totalbooking=0;
        File f = new File("CreatedByCounter.bin");

        if (f.exists()){try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                CreatePassengerTicket cp=(CreatePassengerTicket)ois.readObject();
                totalbooking+=cp.numberofseat;
            }
        }
        catch(Exception e){
            //
        }
        }else {
            aa.setContentText("Database is empty");
            aa.show();
            return;
        }
        showtotalbook.setText(" "+totalbooking);


    }

    @javafx.fxml.FXML
    public void filterbutton(ActionEvent actionEvent) {
        tableview.getItems().clear();
        System.out.println("button working");
        File f = new File("CreatedByCounter.bin");
        if (f.exists()){try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                CreatePassengerTicket cp=(CreatePassengerTicket)ois.readObject();
                if (cp.cargosapce <= Integer.parseInt(spacenumberTF.getText())){
                    tableview.getItems().add(cp);
                }
            }
        }
        catch(Exception e){
            //
        }
        }else {
            aa.setContentText("Database is empty");
            aa.show();
        }
    }

    @javafx.fxml.FXML
    public void loadtablebutton(ActionEvent actionEvent) {
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
    public void hightspaidnamebutton(ActionEvent actionEvent) {
        int max=0 ;
        String str="";
        File f = new File("CreatedByCounter.bin");
        if (f.exists()){try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                CreatePassengerTicket cp=(CreatePassengerTicket)ois.readObject();
                if (cp.yourtotalprice >= max){
                    max=cp.yourtotalprice;
                    str=cp.nametf;
                }
            }
        }
        catch(Exception e){
            //
        }
        }else {

            aa.setContentText("Database is empty");
            aa.show();
            return;
        }

        nameshow.setText(" "+str);


    }

    @javafx.fxml.FXML
    public void dashboardbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/ticketagent/TicketAgent-Dashboard-page.fxml", actionEvent);

    }
}
