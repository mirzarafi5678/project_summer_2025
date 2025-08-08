package com.example.finalproject_oop213.MirzaMdSufianHridoy.TicketAgentController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.LaunchTrip;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.*;

public class TotalPriceController {
    @javafx.fxml.FXML
    private Label TotalPrice;
    @javafx.fxml.FXML
    private Label PassengerCount;

    @javafx.fxml.FXML
    void initialize(){
        int count = 0;
        File f2 = new File("CreatedByCounter.bin");

        if (f2.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f2))) {
                while (true) {
                    try {
                        ois.readObject();
                        count++;
                    } catch (EOFException eof) {
                        break; // End of file reached, break the loop
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        PassengerCount.setText(String.valueOf(count));

    }



    @javafx.fxml.FXML
    public void DashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/ticketagent/TicketAgent-Dashboard-page.fxml", actionEvent);


    }

    @javafx.fxml.FXML
    public void SeeTotalButton(ActionEvent actionEvent) {
//
    }



}
