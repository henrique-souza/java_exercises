module com.example.database_exercise {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.database_exercise to javafx.fxml;
    exports com.example.database_exercise;
}