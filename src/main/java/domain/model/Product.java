package domain.model;

public class Product {

    private int id;
    private String naam;
    private double prijs;
    private int hoeveelheid;

    public Product(String naam, double prijs, int hoeveelheid) {
        this.naam = naam;
        this.prijs = prijs;
        this.hoeveelheid = hoeveelheid;
    }
    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public double getPrijs() {
        return prijs;
    }
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getHoeveelheid() {
        return hoeveelheid;
    }
    public void setHoeveelheid(int hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}