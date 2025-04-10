package it.edu.calvino.java_gestionecamere;
import java.time.LocalDate;

public class Reservation {

    private Host host;
    private Room room;
    private Client client;
    private LocalDate checkIn;
    private LocalDate checkOut;
    public Reservation(Host host, Room room, Client client, LocalDate checkIn, LocalDate checkOut){
        this.host = host;
        this.room = room;
        this.client = client;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Host getHost(){
        return host;
    }
    public Room getRoom(){
        return room;
    }
    public Client getClient(){
        return client;
    }
    public LocalDate getCheckIn(){
        return checkIn;
    }
    public LocalDate getCheckOut(){
        return checkOut;
    }

    public void setHost(Host host){
        this.host = host;
    }
    public void setRoom(Room room){
        this.room = room;
    }
    public void setClient(Client client){
        this.client = client;
    }
    public void setCheckIn(LocalDate checkIn){
        this.checkIn = checkIn;
    }
    public void setCheckOut(LocalDate checkOut){
        this.checkOut = checkOut;
    }
}
