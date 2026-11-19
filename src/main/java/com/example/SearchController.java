package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class SearchController {
    @FXML
   private ComboBox<String> lengthComBox;

   @FXML
   private Button searchButton;

   @FXML
   private ComboBox<String> genreComBox;



    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("recommendations");
    }
}
