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

   @FXML
   private void initialize() {
    // [x] test data
      genreComBox.getItems().addAll(
        "小説",
        "漫画",
        "ビジネス書",
        "実用書",
        "その他"
      );

      lengthComBox.getItems().addAll(
        "短い",
        "普通",
        "長い"
      );
   }
}
