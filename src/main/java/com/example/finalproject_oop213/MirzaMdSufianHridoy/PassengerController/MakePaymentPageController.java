package com.example.finalproject_oop213.MirzaMdSufianHridoy.PassengerController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.PutObjectInBinFileOrTxtFile;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.SceneSwitcher;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.addInList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class MakePaymentPageController {
    @FXML
    private Label PriceofTicket;
    @FXML
    private TextField trxFiield;
    @FXML
    private Label StatusShow;
    @FXML
    private Label ticketDetails;

    @FXML
    void initialize(){

        ticketDetails.setWrapText(true);
        ticketDetails.setPrefWidth(400);
        ticketDetails.setStyle("-fx-font-size: 14px; -fx-padding: 10;");

        if (addInList.bb.size() > 0 && addInList.bb.get(addInList.bb.size() - 1) != null) {
            ticketDetails.setText( addInList.bb.get(addInList.bb.size() - 1).obj.toString());

        }else{

            ticketDetails.setText("Buy tickt first");
        }

    }



    @FXML
    public void DashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/Passenger-Dashboard-page.fxml",actionEvent);

    }

    @FXML
    public void ConfirmButton(ActionEvent actionEvent) {
        Alert aa= new Alert(Alert.AlertType.ERROR);
        if (trxFiield.getText().isEmpty()){
            aa.setContentText("Put trxId");
            aa.show();

        }else {
            addInList.bb.get(addInList.bb.size() - 1).setBoughtticket(true);
            addInList.bb.get(addInList.bb.size() - 1).setCancelticket(false);
            PutObjectInBinFileOrTxtFile.overwriteTxtFile("passengerdata.txt",addInList.bb.size() - 1);
//            need to put this thing in txt file


            StatusShow.setWrapText(true);
            StatusShow.setText("Thank you for buy the ticket. Go to Ticket Counter manually to get your ticket");
        }

    }

    @FXML
    public void seePriceButton(ActionEvent actionEvent) {

        if (addInList.bb.size() > 0 && addInList.bb.get(addInList.bb.size() - 1) != null) {
//            ticketDetails.setText( addInList.bb.get(addInList.bb.size() - 1).obj.toString());

        }else{

            PriceofTicket.setText("Buy tickt first");
            return;
        }
        int sum3 = 0;
        int sum1= addInList.bb.get(addInList.bb.size() - 1).getNumberOfTicket() *
                addInList.bb.get(addInList.bb.size() - 1).obj.price;

        int sum2= addInList.bb.get(addInList.bb.size() - 1).needBaseCargoSpace * 20;

        if ( addInList.bb.get(addInList.bb.size() - 1).typeOfSeat.equals("Sitting Seats") ){
             sum3 = addInList.bb.get(addInList.bb.size() - 1).getNumberOfTicket() * 200;

        }
        if ( addInList.bb.get(addInList.bb.size() - 1).typeOfSeat.equals("Chair Seats") ){
             sum3 = addInList.bb.get(addInList.bb.size() - 1).getNumberOfTicket() * 100;
        }
        if ( addInList.bb.get(addInList.bb.size() - 1).typeOfSeat.equals("Berths") ) {
             sum3 = addInList.bb.get(addInList.bb.size() - 1).getNumberOfTicket() * 300;
        }

//        int totalPrice=0;
        int totalPrice=  sum1 +sum2 + sum3;
        addInList.bb.get(addInList.bb.size() - 1).setTotalprice(totalPrice);

        String str = "Base Ticket Price: " + sum1 + "\n"
                + "Cargo Space Charge: " + sum2 + "\n"
                + "Seat Type Charge: " + sum3 + "\n"
                + "------------------------\n"
                + "Total Price: " + totalPrice;



        PriceofTicket.setWrapText(true);
        PriceofTicket.setText(str);

    }

}
//"Sitting Seats", "Chair Seats", "Berths"