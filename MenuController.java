package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    @FXML
    private Button calcSwitch;

    @FXML
    private Button sortSwitch;

    @FXML
    private Button dbSwitch;

    @FXML
    void initialize() {
        calcSwitch.setOnAction(event -> {
            calcSwitch.getScene().getWindow().hide();

            switch () {

            }

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/sample.fxml"));

            try { loader.load(); }
            catch (IOException e) { e.printStackTrace(); }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        sortSwitch.setOnAction(event -> {
            sortSwitch.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/app.fxml"));

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

        dbSwitch.setOnAction(event -> {
            dbSwitch.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/db.fxml"));

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
