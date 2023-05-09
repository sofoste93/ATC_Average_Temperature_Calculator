module com.sofoste.averagetemperaturecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.sofoste.averagetemperaturecalculator to javafx.fxml;
    exports com.sofoste.averagetemperaturecalculator;
}