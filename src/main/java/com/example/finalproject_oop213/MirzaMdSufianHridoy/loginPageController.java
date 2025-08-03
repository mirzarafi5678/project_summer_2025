package com.example.finalproject_oop213.MirzaMdSufianHridoy;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class loginPageController {


    @javafx.fxml.FXML
    private TextField usernameTF;
    @javafx.fxml.FXML
    private PasswordField passwordTF;
    @javafx.fxml.FXML
    private ComboBox<String> UserTypeComboBox;

    @javafx.fxml.FXML
    public void SignUpButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/finalproject_oop213/MirzaMdSufianHridoy_fxml/SignUp_page.fxml",actionEvent);

    }

    @javafx.fxml.FXML
    public void logInButton(ActionEvent actionEvent) {
    }
}
