module com.example.javaweek2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaweek2 to javafx.fxml;
    exports com.example.javaweek2;
}