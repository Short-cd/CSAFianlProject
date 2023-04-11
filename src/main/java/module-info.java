module com.example.csafianlproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.logging;

    opens com.example.csafianlproject to javafx.fxml;
    exports com.example.csafianlproject;
}