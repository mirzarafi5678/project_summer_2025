package com.example.finalproject_oop213.MirzaMdSufianHridoy.PassengerController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.*;
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
    void initialize(){
        bookDetailShow.setWrapText(true);
        bookDetailShow.setPrefWidth(400);            // Set preferred width
        bookDetailShow.setStyle("-fx-font-size: 14px; -fx-padding: 10;");

        if (addInList.bb.size() > 0 && addInList.bb.get(addInList.bb.size() - 1) != null) {
            bookDetailShow.setText( addInList.bb.get(addInList.bb.size() - 1).obj.toString());

        }else{

            bookDetailShow.setText("Buy tickt first");
        }


    }




    @javafx.fxml.FXML
    public void BackToDashbiardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/Passenger-Dashboard-page.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void CancelTicketButton(ActionEvent actionEvent) {

        if (addInList.bb.size() > 0 && addInList.bb.get(addInList.bb.size() - 1) != null) {
            addInList.bb.get(addInList.bb.size() - 1).setBoughtticket(false);
            addInList.bb.get(addInList.bb.size() - 1).setCancelticket(true);

            PutObjectInBinFileOrTxtFile.overwriteTxtFile("passengerdata.txt",addInList.bb.size() - 1);
            addInList.bb.remove(addInList.bb.size() - 1);
            SHowStatus.setText("Succesfully removes");

//            need to put the data in txt file



        }
        else{
            SHowStatus.setText("You did not bought ticket .So cant remove");

        }


    }
}
