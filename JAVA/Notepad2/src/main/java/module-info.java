module com.example.notepad2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.notepad2 to javafx.fxml;
    exports com.example.notepad2;
}