package com.example.finalproject_oop213.MirzaMdSufianHridoy.PassengerController;

import com.example.finalproject_oop213.MirzaMdSufianHridoy.PutObjectInBinFileOrTxtFile;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.SceneSwitcher;
import com.example.finalproject_oop213.MirzaMdSufianHridoy.sessionmanager;
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

        if (sessionmanager.latestuser.pass==null){
            ticketDetails.setText("Create passenger acc and buy ticket first");
            return;

        }

        if (sessionmanager.latestuser.pass.obj==null){
            ticketDetails.setText("Buy tickt first");
            return;

        }
        ticketDetails.setText(sessionmanager.latestuser.pass.obj.style1());


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

            sessionmanager.latestuser.pass.setBoughtticket(true);
            sessionmanager.latestuser.pass.setCancelticket(false);
            PutObjectInBinFileOrTxtFile.overwriteTxtFile("passengerdata.txt",sessionmanager.latestuser.pass.style2());

            PutObjectInBinFileOrTxtFile.updateUser(sessionmanager.latestuser);

//            addInList.bb.get(addInList.bb.size() - 1).setBoughtticket(true);
//            addInList.bb.get(addInList.bb.size() - 1).setCancelticket(false);
//            PutObjectInBinFileOrTxtFile.overwriteTxtFile("passengerdata.txt",addInList.bb.size() - 1);
//            need to put this thing in txt file


            StatusShow.setWrapText(true);
            StatusShow.setText("Thank you for buy the ticket. Print the downloaded ticket and Go " +
                    "to Ticket Counter manually to get your ticket by showing your printed pdf ");
        }

    }

    @FXML
    public void seePriceButton(ActionEvent actionEvent) {

        if (sessionmanager.latestuser.pass.obj!=null) {
//            ticketDetails.setText( addInList.bb.get(addInList.bb.size() - 1).obj.toString());

        }else{

            PriceofTicket.setText("Buy tickt first");
            return;
        }
        int sum3 = 0;
        int sum1= sessionmanager.latestuser.pass.getNumberOfTicket() *
                sessionmanager.latestuser.pass.obj.price;

        int sum2= sessionmanager.latestuser.pass.needBaseCargoSpace * 20;

        if ( sessionmanager.latestuser.pass.typeOfSeat.equals("Sitting Seats") ){
             sum3 = sessionmanager.latestuser.pass.getNumberOfTicket() * 200;

        }
        if ( sessionmanager.latestuser.pass.typeOfSeat.equals("Chair Seats") ){
             sum3 = sessionmanager.latestuser.pass.getNumberOfTicket() * 100;
        }
        if ( sessionmanager.latestuser.pass.typeOfSeat.equals("Berths") ) {
             sum3 = sessionmanager.latestuser.pass.getNumberOfTicket() * 300;
        }

//        int totalPrice=0;
        int totalPrice=  sum1 +sum2 + sum3;
        sessionmanager.latestuser.pass.totalprice=totalPrice;
        PutObjectInBinFileOrTxtFile.updateUser(sessionmanager.latestuser);

//        addInList.bb.get(addInList.bb.size() - 1).setTotalprice(totalPrice);

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