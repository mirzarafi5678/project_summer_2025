package com.example.finalproject_oop213.MirzaMdSufianHridoy.PassengerController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.PutObjectInBinFileOrTxtFile;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class ViewNoticePageController {
    @javafx.fxml.FXML
    private Label ShowNotice;

    @javafx.fxml.FXML
    void initialize(){

        String str="";
        str= PutObjectInBinFileOrTxtFile.readFromTxtFile("Notice.txt");
        ShowNotice.setWrapText(true);
        ShowNotice.setText(str);




    }


    @javafx.fxml.FXML
    public void DahboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/Passenger-Dashboard-page.fxml", actionEvent);


    }
}
