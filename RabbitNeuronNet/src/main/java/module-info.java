module com.example.snakeneironetwork {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.snakeneironetwork to javafx.fxml;
    exports com.example.snakeneironetwork;
    exports com.example.snakeneironetwork.rabbit;
    opens com.example.snakeneironetwork.rabbit to javafx.fxml;
}