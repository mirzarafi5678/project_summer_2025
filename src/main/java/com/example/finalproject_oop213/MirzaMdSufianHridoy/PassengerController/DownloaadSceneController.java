package com.example.finalproject_oop213.MirzaMdSufianHridoy.PassengerController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.PutObjectInBinFileOrTxtFile;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.addInList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class DownloaadSceneController {
    @javafx.fxml.FXML
    private Label ShowTheTicket;
    @javafx.fxml.FXML
    private Label StatusShow;

    @javafx.fxml.FXML
    void initialize(){
        if (addInList.bb.size() > 0 && addInList.bb.get(addInList.bb.size() - 1) != null) {
            ShowTheTicket.setWrapText(true);
            ShowTheTicket.setText( addInList.bb.get(addInList.bb.size() - 1).obj.toString()+"\n"+ addInList.bb.get(addInList.bb.size() - 1).toString() );

        }else{

            ShowTheTicket.setText("Buy tickt first");
        }


    }


    @javafx.fxml.FXML
    public void SaveibTxtFileButton(ActionEvent actionEvent) {
        if (addInList.bb.size() > 0 && addInList.bb.get(addInList.bb.size() - 1) != null) {
            PutObjectInBinFileOrTxtFile.overwriteTxtFile("passengerdata.txt",addInList.bb.get(addInList.bb.size() - 1).obj);
            PutObjectInBinFileOrTxtFile.writeObjectInTxtFile("passengerdata.txt",addInList.bb.get(addInList.bb.size() - 1));
            StatusShow.setWrapText(true);
            StatusShow.setText("Show your ticket details at the counter manually. The counter staff will " +
                    "check your details and decide whether you will get th e ticket or not.");

        }else{

            StatusShow.setText("    Buy the Ticket Fiest ");
            return;
        }


    }
}
