module com.example.genetic_bird {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.genetic_bird to javafx.fxml;
    exports com.example.genetic_bird;
}