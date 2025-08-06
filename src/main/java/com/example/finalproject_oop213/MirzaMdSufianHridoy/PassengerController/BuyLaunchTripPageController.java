package com.example.finalproject_oop213.MirzaMdSufianHridoy.PassengerController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.*;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.PassengerData;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.Enumeration;

public class BuyLaunchTripPageController {
    @FXML
    private ComboBox<String> TypeOfSeatComboBox;
    @FXML
    private TableColumn<LaunchTrip, String> ToColumn;
    @FXML
    private TableView<LaunchTrip> TableviewShow;
    @FXML
    private TableColumn<LaunchTrip, String> StartTimeColumn;
    @FXML
    private ComboBox<String> GenderComboBox;
    @FXML
    private TextField NeedBaseAmountTF;
    @FXML
    private TableColumn<LaunchTrip, String> DateColumn;
    @FXML
    private TextField FullnameTF;
    @FXML
    private Label StatusShow;
    @FXML
    private TextField BkashNoTF;
    @FXML
    private TextField PhoneNoTF;
    @FXML
    private TableColumn<LaunchTrip, String> FromColumn;
    @FXML
    private TextField TripNumberTF;
    @FXML
    private TextField NumberOfTicketTF;
    @FXML
    private TableColumn<LaunchTrip, String> TripNumberColumn;
    @FXML
    private TableColumn<LaunchTrip, String> EstimatedHourColumn;


    File f = new File("LaunchTrip.bin");

    @FXML
    void initialize() {
        System.out.println("yoyo");
        try {
            FileInputStream fis = new FileInputStream(f);

            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                TableviewShow.getItems().add((LaunchTrip) ois.readObject());
            }
        } catch (Exception e) {
            //
        }


        GenderComboBox.getItems().addAll("Male", "Female");
        TypeOfSeatComboBox.getItems().addAll("Sitting Seats", "Chair Seats", "Berths");


        TripNumberColumn.setCellValueFactory(new PropertyValueFactory<>("tripNumber"));
        FromColumn.setCellValueFactory(new PropertyValueFactory<>("from"));
        ToColumn.setCellValueFactory(new PropertyValueFactory<>("to"));
        StartTimeColumn.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        DateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        EstimatedHourColumn.setCellValueFactory(new PropertyValueFactory<>("estimatedHour"));



    }


    @FXML
    public void ConfirmTicketButton(ActionEvent actionEvent) {
        LaunchTrip obj = null;

        File f = new File("LaunchTrip.bin");
        if (f.exists()) {
            try (FileInputStream fis = new FileInputStream(f);
                 ObjectInputStream ois = new ObjectInputStream(fis)) {

                while (true) {
                    try {
                        LaunchTrip trip = (LaunchTrip) ois.readObject();

                        if (trip.getTripNumber().equals(TripNumberTF.getText())) {
                            obj = trip;
                            break;
                        }

                    } catch (EOFException eof) {
                        break;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (obj != null) {
            PassengerData datas = new PassengerData(
                    FullnameTF.getText(),
                    obj,
                    Integer.parseInt(NumberOfTicketTF.getText()),
                    Integer.parseInt(NeedBaseAmountTF.getText()),
                    TypeOfSeatComboBox.getValue(),
                    GenderComboBox.getValue(),
                    PhoneNoTF.getText(),
                    BkashNoTF.getText()
            );

            addInList.addPassengerData(datas);
            StatusShow.setText("Successfully selected your trip . now go to payment options");

        } else {
            System.out.println("Trip not found!");

        }


    }

    @FXML
    public void BackDashboardButton(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/Passenger-Dashboard-page.fxml", actionEvent);


    }


}
