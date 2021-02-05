package week1.les2.oefening2;

public class Product {
    private String naam;
    private String code;
    private Double prijs;
    private Double btw;

    public Product(String naam, String code, Double prijs){
        this.naam = naam;
        this.code = code;
        this.prijs = prijs;
    }

    public Product(String naam, String code){
        this.naam = naam;
        this.code = code;
    }

    public void setBTW(Double btw){
        this.btw = btw;
    }

    public void setPrijs(Double prijs){
        this.prijs = prijs;
    }

    public Double getBTW(){
        return btw;
    }

    public Double getPrijs(){
        return prijs;
    }

    public void verhoogPrijsMet(Double extra){
        prijs = prijs + extra;
    }

    public Double btwBedrag(){
        return prijs * (btw/100);
    }

    public String toString(){
        return naam + " heeft een code van: " + code + " met de prijs: " + prijs + " met een mogelijke btw van: " + btw;
    }
}
