module com.example.anobankthing {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.anobankthing to javafx.fxml;
    exports com.example.anobankthing;
}