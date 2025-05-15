package it.edu.calvino.java_gestionecamere;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller per la gestione della home page dell'applicazione.
 * Fornisce metodi per la navigazione verso altre pagine, ad esempio la pagina di prenotazione e la pagina di feedback.
 */
public class HomeController {

    /**
     * Metodo chiamato quando l'utente interagisce con l'elemento della UI associato alla riserva (ad esempio un pulsante).
     * Questo metodo apre una nuova finestra con la pagina di prenotazione (reserve.fxml).
     *
     * @throws IOException Se il file FXML non viene trovato o non può essere caricato.
     */
    @FXML
    protected void reservePage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("reserve.fxml"));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    /**
     * Metodo chiamato quando l'utente interagisce con l'elemento della UI associato al feedback (ad esempio un pulsante).
     * Questo metodo apre una nuova finestra con la pagina di feedback (feedback.fxml).
     *
     * @throws IOException Se il file FXML non viene trovato o non può essere caricato.
     */
    @FXML
    protected void feedbackPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("feedback.fxml"));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

}