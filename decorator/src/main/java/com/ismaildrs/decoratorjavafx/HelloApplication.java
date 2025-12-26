package com.ismaildrs.decoratorjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/ismaildrs/decoratorjavafx/main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 400);

        stage.setTitle("Boisson - Design Pattern Decorator");
        stage.setScene(scene);
        stage.show();
    }
}
