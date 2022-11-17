module com.example.javainventoryproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javainventoryproject to javafx.fxml;
    exports com.example.javainventoryproject;
}