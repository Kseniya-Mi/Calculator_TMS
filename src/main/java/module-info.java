module com.example.calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.scripting;
    requires rhino;


    opens com.example.calculator to javafx.fxml;
    exports com.example.calculator;
}