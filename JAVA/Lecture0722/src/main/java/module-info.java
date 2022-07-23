module com.example.lecture0722 {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.java;
    requires java.sql;


    opens com.example.lecture0722.step1 to javafx.fxml;
    exports com.example.lecture0722.step1;
}