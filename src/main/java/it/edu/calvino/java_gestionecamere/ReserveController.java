package it.edu.calvino.java_gestionecamere;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import java.util.ArrayList;

/**
 * Controller per la gestione delle prenotazioni (ReserveController).
 * Questo controller è associato a un'interfaccia utente JavaFX.
 */
public class ReserveController {
    @FXML
    public TextField name;

    @FXML
    public TextField surname;

    @FXML
    public ComboBox<Room> room;

    @FXML
    public DatePicker checkIn;

    @FXML
    public DatePicker checkOut;

    public Administration administration;
    public Host host;


    /**
     * Metodo chiamato automaticamente da JavaFX dopo il caricamento del file FXML.
     * Serve a inizializzare i dati e configurare gli elementi dell'interfaccia.
     */
    @FXML
    public void initialize(){

        initializeAdmin();

        //Popolazione della combobox
        ObservableList<Room> listInstance = FXCollections.observableArrayList(administration.getRooms());
        room.setItems(listInstance);

    }

    /**
     * Inizializza i dati di amministrazione, creando un host e una lista di stanze.
     */
    @FXML
    public void initializeAdmin(){
        //Costruzione dell'array list di camere
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Suite", 3, 200));
        rooms.add(new Room("Deluxe", 2, 100));
        rooms.add(new Room("Deluxe", 2, 100));
        rooms.add(new Room("Deluxe", 2, 100));
        rooms.add(new Room("Singola", 1, 50));
        rooms.add(new Room("Singola", 1, 50));
        rooms.add(new Room("Singola", 1, 50));

        //Costruzione dell'amministrazione dell'hotel
        host = new Host("Sirenella", "Via Don Giovanni, verità");
        administration = new Administration(host, rooms);
    }

    /**
     * Metodo chiamato quando l'utente effettua una prenotazione.
     * Crea un oggetto Reservation con i dati forniti dall'utente e lo aggiunge al sistema di amministrazione.
     */
    @FXML
    public void reserve(){
        if (!isInputValid()) {
            return; // Esce dal metodo se uno dei campi non è valido
        }

        //Creazione della prenotazione
        Client c = new Client(name.getText(), surname.getText());
        Reservation r = new Reservation(administration.getHost(), room.getSelectionModel().getSelectedItem(), c, checkIn.getValue(), checkOut.getValue());

        //Aggiunta della prenotazione all'hotel
        administration.addReservation(r);

    }

    /**
     * Metodo per validare gli input dell'utente.
     * Controlla che tutti i campi necessari siano riempiti correttamente.
     * @return true se tutti i campi sono validi, altrimenti false.
     */
    private boolean isInputValid() {
        // Controllo se il nome è vuoto o nullo
        if (name.getText() == null || name.getText().trim().isEmpty()) {
            showError("Il campo 'Nome' è obbligatorio.");
            return false;
        }

        // Controllo se il cognome è vuoto o nullo
        if (surname.getText() == null || surname.getText().trim().isEmpty()) {
            showError("Il campo 'Cognome' è obbligatorio.");
            return false;
        }

        // Controllo se una stanza è stata selezionata
        if (room.getSelectionModel().getSelectedItem() == null) {
            showError("Per favore, seleziona una stanza.");
            return false;
        }

        // Controllo se la data di check-in è stata selezionata
        if (checkIn.getValue() == null) {
            showError("Per favore, seleziona una data di check-in.");
            return false;
        }

        // Controllo se la data di check-out è stata selezionata
        if (checkOut.getValue() == null) {
            showError("Per favore, seleziona una data di check-out.");
            return false;
        }

        // Controllo che la data di check-in sia precedente alla data di check-out
        if (checkIn.getValue().isAfter(checkOut.getValue())) {
            showError("La data di check-in deve essere precedente alla data di check-out.");
            return false;
        }

        // Controllo che la data di check-in non sia uguale alla data di check-out
        if (checkIn.getValue().isEqual(checkOut.getValue())) {
            showError("La data di check-in e la data di check-out non possono coincidere.");
            return false;
        }

        return true;
    }

    /**
     * Metodo per mostrare un messaggio di errore all'utente.
     * @param message Il messaggio di errore da visualizzare.
     */
    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Errore");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
