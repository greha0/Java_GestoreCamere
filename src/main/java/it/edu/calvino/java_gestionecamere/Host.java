package it.edu.calvino.java_gestionecamere;

public class Host {
    private String name;
    private String address;

    public Host (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }


    @Override
    public String toString() {
        return "Albergo " + name + "\n" + address + "\n";
    }

}
