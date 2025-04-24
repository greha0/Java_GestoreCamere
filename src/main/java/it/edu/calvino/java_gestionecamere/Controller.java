package it.edu.calvino.java_gestionecamere;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Controller {
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
    protected void reservePage(){
        title.setText("Prenotazione");
        home.getChildren().remove(reserveButton);
    }
}