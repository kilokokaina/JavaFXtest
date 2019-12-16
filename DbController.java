package sample.controllers;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

class Person {
    private String first_name;
    private String second_name;
    private String phone_number;

    Person(String first_name, String second_name, String phone_number) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.phone_number = phone_number;
    }

    public String getFirst_name() { return first_name; }
    public String getSecond_name() { return second_name; }
    public String getPhone_number() { return phone_number; }

    public void setFirst_name(String first_name) { this.first_name = first_name; }
    public void setSecond_name(String second_name) { this.second_name = second_name; }
    public void setPhone_number(String phone_number) { this.phone_number = phone_number; }

    @Override
    public String toString() {
        return "Информация: " + getFirst_name() + '\'' +
                ", '" + getSecond_name() + '\'' +
                ", " + getPhone_number() + '\n';
    }
}

public class DbController {
    ArrayList<Person> arrayListPerson = new ArrayList<>();

    @FXML
    private TextArea firstName;

    @FXML
    private TextArea secondName;

    @FXML
    private TextArea phoneNumber;

    @FXML
    private Label infoLabel;

    @FXML
    private Button addNewUserBtn;

    @FXML
    private Button showUsersBtn;

    @FXML
    void initialize() {
        addNewUserBtn.setOnAction(event -> {
            Person person = new Person(firstName.getText(), secondName.getText(), phoneNumber.getText());
            arrayListPerson.add(person);
        });

        showUsersBtn.setOnAction(event -> {
            for (int i = 0; i < arrayListPerson.size(); i++) {
                infoLabel.setText(arrayListPerson.toString());
            }
        });
    }
}
