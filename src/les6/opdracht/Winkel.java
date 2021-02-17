package les6.opdracht;

import java.util.ArrayList;

public class Winkel {
    private String naam;
    private ArrayList<Klant> klanten;

    public Winkel(String naam) {
        this.naam = naam;
        klanten = new ArrayList<Klant>();
    }

    public void voegKlantToe(Klant nieuweKlant) {
        klanten.add(nieuweKlant);
    }

    public ArrayList<Klant> getKlanten(){
        return klanten;
    }
    public String toString(){
        return "winkel " + naam + " heeft " + klanten.size() + " klanten\n";
    }
}

