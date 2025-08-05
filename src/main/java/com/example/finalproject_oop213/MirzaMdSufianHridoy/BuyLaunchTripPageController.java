package com.example.finalproject_oop213.MirzaMdSufianHridoy;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class BuyLaunchTripPageController {
    @javafx.fxml.FXML
    private ComboBox<String> TypeOfSeatComboBox;
    @javafx.fxml.FXML
    private TableColumn<LaunchTrip,String> ToColumn;
    @javafx.fxml.FXML
    private TableView<LaunchTrip> TableviewShow;
    @javafx.fxml.FXML
    private TableColumn<LaunchTrip,String> StartTimeColumn;
    @javafx.fxml.FXML
    private ComboBox<String> GenderComboBox;
    @javafx.fxml.FXML
    private TextField NeedBaseAmountTF;
    @javafx.fxml.FXML
    private TableColumn<LaunchTrip,String> DateColumn;
    @javafx.fxml.FXML
    private TextField FullnameTF;
    @javafx.fxml.FXML
    private Label StatusShow;
    @javafx.fxml.FXML
    private TextField BkashNoTF;
    @javafx.fxml.FXML
    private TextField PhoneNoTF;
    @javafx.fxml.FXML
    private TableColumn<LaunchTrip,String> FromColumn;
    @javafx.fxml.FXML
    private TextField TripNumberTF;
    @javafx.fxml.FXML
    private TextField NumberOfTicketTF;
    @javafx.fxml.FXML
    private TableColumn <LaunchTrip,String> TripNumberColumn;
    @javafx.fxml.FXML
    private TableColumn <LaunchTrip,String>EstimatedHourColumn;

    @javafx.fxml.FXML
    void initialize(){

    }


    @javafx.fxml.FXML
    public void ConfirmTicketButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackDashboardButton(ActionEvent actionEvent) {
    }



}
