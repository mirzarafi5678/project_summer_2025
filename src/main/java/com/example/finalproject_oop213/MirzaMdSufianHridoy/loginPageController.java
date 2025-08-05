package com.example.finalproject_oop213.MirzaMdSufianHridoy;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class loginPageController {


    @javafx.fxml.FXML
    private TextField usernameTF;
    @javafx.fxml.FXML
    private PasswordField passwordTF;
    @javafx.fxml.FXML
    private ComboBox<String> UserTypeComboBox;

    @javafx.fxml.FXML
    void initialize(){
        UserTypeComboBox.getItems().addAll("Passenger","Ticket Agent","Financial Officer","Call Center Agent",
                "Operation Manager","Guest User", "Safety Inspector","Port Authority");
    }

    @javafx.fxml.FXML
    public void SignUpButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/SignUp_page.fxml",actionEvent);

    }

    @javafx.fxml.FXML
    public void logInButton(ActionEvent actionEvent) throws IOException {
        String user="";

        for ( alluserdata aa :  addInList.aa  ) {
            if ( aa.getSetUsername().equals(usernameTF.getText()) && aa.getSetpassword().equals(passwordTF.getText())
                     && aa.getSetusertype().equals(UserTypeComboBox.getValue()) )  {

                user= aa.getSetusertype();
                break;
            }
        }
        if (Objects.equals(user, "Passenger")) {
            SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/PassengerFxmlFiles/Passenger-Dashboard-page.fxml",actionEvent);

        }
        if (Objects.equals(user, "Ticket Agent")){
            SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/TicketAgentFxmlFiles/TicketAgent-Dashboard-page.fxml",actionEvent);
        }
        if (Objects.equals(user, "Call Center Agent")){
          //
        }
        if (Objects.equals(user, "Financial Officer")){
            //
        }
        if (Objects.equals(user, "Operation Manager")){
            //
        }
        if (Objects.equals(user, "Guest User")){
            //
        }
        if (Objects.equals(user, "Safety Inspector")){
            //
        }
        if (Objects.equals(user, "Port Authority")){
            //
        }




    }
}
