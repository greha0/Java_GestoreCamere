package it.edu.calvino.java_gestionecamere;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader homeLoader = new FXMLLoader(Application.class.getResource("home.fxml"));
        Scene scene = new Scene(homeLoader.load(), 320, 200);
        stage.setTitle("Gestione Camere");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}