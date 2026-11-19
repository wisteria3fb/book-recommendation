package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RecommendationsController {
    @FXML
    private Button secondaryButton;


    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("search");
    }
}