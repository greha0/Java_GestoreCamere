package it.edu.calvino.java_gestionecamere;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerHome {
    @FXML
    public Label title;
    @FXML
    public VBox home;
    @FXML
    public Button reserveButton;
    @FXML
    public Button feedbackButton;

    @FXML
    protected void setTitle() {
        title.setText("Gestione Camere");
    }

    @FXML
    protected void reservePage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("reserve.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
}