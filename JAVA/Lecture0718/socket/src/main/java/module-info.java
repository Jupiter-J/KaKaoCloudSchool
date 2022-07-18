module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test.mission1 to javafx.fxml;
    exports com.example.test.mission1;

    opens com.example.test.mission2 to javafx.fxml;
    exports com.example.test.mission2;
}