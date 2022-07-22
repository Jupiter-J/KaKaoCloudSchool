module com.example.lecture0722 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.lecture0722 to javafx.fxml;
    exports com.example.lecture0722;
}