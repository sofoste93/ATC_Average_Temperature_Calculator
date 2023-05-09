package com.sofoste.averagetemperaturecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ATCController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onExecuteBtnClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}