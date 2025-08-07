package com.example.finalproject_oop213.MirzaMdSufianHridoy.PassengerController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class PassengerDashboardController {


    @javafx.fxml.FXML
    private Label seeYourIdPass;

    @javafx.fxml.FXML
    public void SeeHistoryAndTicketStatusButton(ActionEvent actionEvent) throws IOException {
         SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/historyAndStatus-page.fxml",actionEvent);


    }

    @javafx.fxml.FXML
    public void ViewNoticeFromCounterButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/viewNotice-page.fxml",actionEvent);

    }

    @javafx.fxml.FXML
    public void ViewOtherScheduleButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/ViewOtherTripScheDule_Page.fxml",actionEvent);

    }

    @javafx.fxml.FXML
    public void MakePaymentOfLaunchTripButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/makePayment-page.fxml",actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/login-page.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void RateAllServiceWithFeedbackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/rateFeedback-page.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void CancelLaunchTripTicketButton(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/CancelLaunchTrip-Page.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void DownloadTicketButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/DownloaadScene.fxml");
    }

    @javafx.fxml.FXML
    public void BuyLaunchTripTicketButton(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/BuyLaunchTrip-Page.fxml", actionEvent);

    }
}



