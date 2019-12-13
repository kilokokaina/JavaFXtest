package sample.controllers;

import java.io.IOException;

import java.util.Arrays;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import javafx.stage.Stage;

public class HomeController {
    @FXML
    private TextArea arrayText;

    @FXML
    private Button arraySorting;

    @FXML
    private Button fieldClear;

    @FXML
    private Button backMenu;

    @FXML
    private Label result_array;

    @FXML
        void initialize() {
            arraySorting.setOnAction(event -> {
                String[] step_array = arrayText.getText().split(" ");
                int[] mainArray = new int[step_array.length];

                for (int i = 0; i < mainArray.length; i++) {
                    mainArray[i] = Integer.parseInt(step_array[i]);
                }

                for (int i = 0; i < mainArray.length - 1; i++) {
                    for (int j = 0; j < mainArray.length - i - 1; j++) {
                        if (mainArray[j] > mainArray[j + 1]) {
                            int tmp = mainArray[j];
                            mainArray[j] = mainArray[j + 1];
                            mainArray[j + 1] = tmp;
                        }
                    }
                }

                result_array.setText(Arrays.toString(mainArray));
            });

            fieldClear.setOnAction(event -> {
                arrayText.clear();
                result_array.setText("Результат:");
            });

            backMenu.setOnAction(event -> {
                backMenu.getScene().getWindow().hide();

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/sample.fxml"));

                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            });
        }
}
