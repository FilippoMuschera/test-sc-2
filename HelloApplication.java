package com.example.firstlogintest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login test.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Sportify Login");
        stage.getIcons().add(new Image("https://www.kindpng.com/picc/m/244-2443827_transparent-sports-icon-png-soccer-app-icon-png.png"));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}