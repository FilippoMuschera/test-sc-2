package com.example.firstlogintest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected TextField usernameText;

    @FXML
    protected PasswordField passwordText;

    @FXML
    private Label statusLabel;

    @FXML
    private Button loginButton;

    public void checkLogin(ActionEvent actionEvent) {

        if (Objects.equals(usernameText.getText(), "admin") && Objects.equals(passwordText.getText(), "admin")){
            statusLabel.setText("Logged in successfully!");
            statusLabel.setTextFill(Color.WHITE);
            statusLabel.setOpacity(100);
        }
        else if(Objects.equals(usernameText.getText(), "admin")){
            statusLabel.setText("Incorrect Password");
            statusLabel.setTextFill(Color.RED);
            statusLabel.setOpacity(100);
        }
        else if(Objects.equals(passwordText.getText(), "admin")){
            statusLabel.setText("Incorrect Username");
            statusLabel.setTextFill(Color.RED);
            statusLabel.setOpacity(100);
        }
        else {
            statusLabel.setText("Incorrect Credentials");
            statusLabel.setTextFill(Color.RED);
            statusLabel.setOpacity(100);
        }

    }

}