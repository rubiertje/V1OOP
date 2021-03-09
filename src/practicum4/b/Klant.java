package practicum4.b;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String naam){
        if (naam.equals("")){
            this.naam = null;
        }else {
            this.naam = naam;
        }
    }
    public void setKorting(double kortingsPercentage){
        this.kortingsPercentage = kortingsPercentage;
    }
    public double getKorting(){
        return kortingsPercentage;
    }
    public String toString(){
        if (this.naam == null){
            return "er is geen huurder bekend";
        }else{
            return "op naam van: " + naam + " (korting: " + kortingsPercentage + "%)";
        }
    }
}
