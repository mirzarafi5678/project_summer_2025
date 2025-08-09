package com.example.finalproject_oop213.MirzaMdSufianHridoy.TicketAgentController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.LaunchTrip;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class RemoveOrAddLaunchTripPageController {
    @javafx.fxml.FXML
    private TextField StartTimeTF;
    @javafx.fxml.FXML
    private TableView <LaunchTrip>Tableview;
    @javafx.fxml.FXML
    private TextField ToTF;
    @javafx.fxml.FXML
    private TextField PriceTF;
    @javafx.fxml.FXML
    private TableColumn <LaunchTrip,String>ToColumn;
    @javafx.fxml.FXML
    private TableColumn<LaunchTrip,String> StartTimeColumn;
    @javafx.fxml.FXML
    private TextField FromTF;
    @javafx.fxml.FXML
    private TextField EstimatedTF;
    @javafx.fxml.FXML
    private TableColumn <LaunchTrip,String>EstimatedColumn;
    @javafx.fxml.FXML
    private TableColumn <LaunchTrip,String>PriceColumn;
    @javafx.fxml.FXML
    private TableColumn <LaunchTrip,String>DateColumn;
    @javafx.fxml.FXML
    private Label StatusShow;
    @javafx.fxml.FXML
    private TextField DateTF;
    @javafx.fxml.FXML
    private TextField TripTF;
    @javafx.fxml.FXML
    private TextField RemoveTripTF;
    @javafx.fxml.FXML
    private TableColumn <LaunchTrip,String>FromColumn;
    @javafx.fxml.FXML
    private TableColumn <LaunchTrip,String>TripNumberColumn;

    @javafx.fxml.FXML
    public void LoadDatabaseButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AddDatabaseButton(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void RemoveTripButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DasboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/ticketagent/TicketAgent-Dashboard-page.fxml", actionEvent);
    }
}
