package it.edu.calvino.java_gestionecamere;

public class Room {
    private static int number;
    private final int id;
    private String name;
    private int beds;
    private float pricePerNight;

    public Room (String name, int beds, float pricePerNight) {
        this.name = name;
        this.beds = beds;
        this.pricePerNight = pricePerNight;
        this.id = number;
        number++;
    }

    public int getNumber(){
        return number;
    }

    public int getId(){return id;}

    public String getName(){
        return name;
    }

    public int getBeds(){
        return beds;
    }

    public float getPricePerNight(){
        return pricePerNight;
    }

    public void setName(String name){
        this.name = name;

    }

    public void setBeds(int beds){
        this.beds = beds;

    }

    public void setPricePerNight(float pricePerNight){
        this.pricePerNight = pricePerNight;

    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" + name + "\n" + "Posti letto: " + beds + "\n" + "Prezzo per notte: " + pricePerNight + "\n";
    }

}
