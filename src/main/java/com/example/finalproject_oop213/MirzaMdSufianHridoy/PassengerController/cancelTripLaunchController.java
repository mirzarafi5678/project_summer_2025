package com.example.finalproject_oop213.MirzaMdSufianHridoy.PassengerController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class cancelTripLaunchController {
    @javafx.fxml.FXML
    private Label bookDetailShow;
    @javafx.fxml.FXML
    private Label SHowStatus;
    @javafx.fxml.FXML
    private TextField writeReasonTF;

    @javafx.fxml.FXML
    public void BackToDashbiardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/Passenger-Dashboard-page.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void CancelTicketButton(ActionEvent actionEvent) {





    }
}
