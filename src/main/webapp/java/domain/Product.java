package domain;

public class Item {

    private String naam;
    private double prijs;
    private int aantal;

    public Item(String naam,double prijs,int aantal) {
        this.naam = naam;
        this.prijs = prijs;
        this.aantal = aantal;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getAantal() {
        return aantal;
    }
}