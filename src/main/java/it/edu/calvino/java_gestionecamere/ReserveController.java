package it.edu.calvino.java_gestionecamere;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import java.util.ArrayList;


public class ReserveController {
    @FXML
    public TextField name;

    @FXML
    public TextField surname;

    @FXML
    public ComboBox room;

    @FXML
    public DatePicker checkIn;

    @FXML
    public DatePicker checkOut;

    public ArrayList<Room> rooms;
    public Administration administration;
    public Host host;

    @FXML
    public void initialize(){

        //ArrayList build
        rooms = new ArrayList<>();
        rooms.add(new Room("Suite", 3, 200));
        rooms.add(new Room("Deluxe", 2, 100));
        rooms.add(new Room("Deluxe", 2, 100));
        rooms.add(new Room("Deluxe", 2, 100));
        rooms.add(new Room("Singola", 1, 50));
        rooms.add(new Room("Singola", 1, 50));
        rooms.add(new Room("Singola", 1, 50));

        //Administration build
        host = new Host("Sirenella", "Via Don Giovanni, verità");
        administration = new Administration(host, rooms);

        //Combobox population
        ObservableList<Room> listInstance = FXCollections.observableArrayList(rooms);
        room.setItems(listInstance);

    }

    @FXML
    public void reserve(){

        //Reservation
        Client c = new Client(name.getText(), surname.getText());
        Reservation r = new Reservation(host, (Room) room.getSelectionModel().getSelectedItem(), c, checkIn.getValue(), checkOut.getValue());
        administration.addReservation(r);

    }
}
