package it.edu.calvino.java_gestionecamere;
import java.util.ArrayList;

public class Administration {
    private final Host host;
    private final ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public Administration (Host h, ArrayList<Room> r){
        host = h;
        rooms = r;
        reservations = new ArrayList<>(20);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Host getHost() {
        return host;
    }

    public void addReservation(Reservation reserve){
        for(Reservation r : reservations){
            if(reserve.getRoom().getId() == r.getRoom().getId()){
                System.out.println("Impossibile eseguire la prenotazione. Stanza occupata");
                return;
            }
        }
        reservations.add(reserve);
        System.out.println(reserve);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Reservation r : reservations){
            sb.append(r.toString());
        }

        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }
}
