module com.example.finalproject_oop213 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalproject_oop213 to java.base, javafx.fxml;
    opens com.example.finalproject_oop213.MirzaMdSufianHridoy to javafx.fxml,java.base;
    opens com.example.finalproject_oop213.IsratJahaBithi to javafx.fxml,java.base;

    exports com.example.finalproject_oop213;


}
