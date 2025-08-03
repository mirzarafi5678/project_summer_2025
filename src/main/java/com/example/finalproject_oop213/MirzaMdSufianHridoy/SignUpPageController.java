package com.example.finalproject_oop213.MirzaMdSufianHridoy;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class SignUpPageController {
    @javafx.fxml.FXML
    private Label StatusShowLabel;
    @javafx.fxml.FXML
    private ComboBox <String> SelectUserComboBox;
    @javafx.fxml.FXML
    private TextField setUsernameTF;
    @javafx.fxml.FXML
    private TextField setidTF;
    @javafx.fxml.FXML
    private TextField SetPasswordTF;
    Alert aa= new Alert(Alert.AlertType.ERROR);
    ArrayList<alluserdata> arr1 = new ArrayList<>();
    @javafx.fxml.FXML
    void initialize(){
        SelectUserComboBox.getItems().addAll("Passenger","Ticket Agent","Financial Officer","Call Center Agent",
                "Operation Manager","Guest User", "Safety Inspector","Port Authority");

    }


    @javafx.fxml.FXML
    public void GoToLogInButton(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/login-page.fxml",actionEvent);


    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
          if (setidTF.getText().isEmpty() || setUsernameTF.getText().isEmpty() || SetPasswordTF.getText().isEmpty() || SelectUserComboBox.getValue()==null ){
              aa.setContentText("Fill up EveryThing");
              aa.show();
              return;
          }
          for ( alluserdata all : arr1 ){
              if (all.getSetid()==Integer.parseInt(setidTF.getText())){
                  aa.setContentText("this id already used. put different id ");
                  aa.show();
                  return;
              }
          }


          alluserdata datas =new alluserdata(
                  SetPasswordTF.getText(),
                  Integer.parseInt(setidTF.getText()),
                  SelectUserComboBox.getValue(),
                  setUsernameTF.getText() );

          arr1.add(datas);

          StatusShowLabel.setText("succesfully sign up .Now go log in page to your dashboard");


    }
}
