package practicum4.a;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd){
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String toString(){
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}
