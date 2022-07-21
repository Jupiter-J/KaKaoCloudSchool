module com.example.book {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires commons.dbcp2;
    requires java.management;

    opens com.example.book.basic to javafx.fxml;
    exports com.example.book.basic;


    opens com.example.book.mission to javafx.fxml;
    exports com.example.book.mission;
}