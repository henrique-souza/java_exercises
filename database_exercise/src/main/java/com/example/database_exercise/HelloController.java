package com.example.database_exercise;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Dá uma olhada na aula de banco de dados com Java e se vira.!");
    }
}