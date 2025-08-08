module com.example.finalproject_oop {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.finalproject_oop213 to java.base, javafx.fxml;
    opens com.example.finalproject_oop213.MirzaMdSufianHridoy to javafx.fxml, java.base;
    opens com.example.finalproject_oop213.IsratJahan to javafx.fxml, java.base;
    opens com.example.finalproject_oop213.MirzaMdSufianHridoy.PassengerController to java.base, javafx.fxml;
    opens com.example.finalproject_oop213.MirzaMdSufianHridoy.TicketAgentController to java.base, javafx.fxml;

    opens com.example.finalproject_oop213.ArifFaisal to javafx.fxml, java.base;
    opens com.example.finalproject_oop213.TouhidYash to javafx.fxml, java.base;

    exports com.example.finalproject_oop213;
    exports com.example.finalproject_oop213.MirzaMdSufianHridoy;
}
