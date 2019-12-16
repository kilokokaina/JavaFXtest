package sample.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import javafx.stage.Stage;

public class Controller {

    @FXML
    private TextArea secondNumText;

    @FXML
    private Label resultLabel;

    @FXML
    private Button addNums;

    @FXML
    private Button mulNums;

    @FXML
    private Button subNums;

    @FXML
    private Button divNums;

    @FXML
    private Button clearFields;

    @FXML
    private TextArea firstNumText;

    @FXML
    void initialize() {
        addNums.setOnAction(event -> {
            int first_number = Integer.parseInt(firstNumText.getText());
            int second_number = Integer.parseInt(secondNumText.getText());
            int result = first_number + second_number;
            resultLabel.setText(String.valueOf(result));
        });

        mulNums.setOnAction(event -> {
            int first_number = Integer.parseInt(firstNumText.getText());
            int second_number = Integer.parseInt(secondNumText.getText());
            int result = first_number * second_number;
            resultLabel.setText(String.valueOf(result));
        });

        subNums.setOnAction(event -> {
            int first_number = Integer.parseInt(firstNumText.getText());
            int second_number = Integer.parseInt(secondNumText.getText());
            int result = first_number - second_number;
            resultLabel.setText(String.valueOf(result));
        });

        divNums.setOnAction(event -> {
            int first_number = Integer.parseInt(firstNumText.getText());
            int second_number = Integer.parseInt(secondNumText.getText());
            int result = first_number / second_number;
            resultLabel.setText(String.valueOf(result));
        });

        clearFields.setOnAction(event -> {
            firstNumText.clear();
            secondNumText.clear();
            resultLabel.setText("Результат");
        });
    }
}