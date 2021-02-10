package opdracht_AD;

import java.util.ArrayList;

public class LuchtvaartMaatschappij {
    private String naam;
    private ArrayList<Vliegtuig> vliegtuigen;

    public LuchtvaartMaatschappij(String naam) {
        this.naam = naam;
    }

    public void addVliegtuig(String vliegtuig){
//        vliegtuigen.add(1, vliegtuig);
    }
    public ArrayList<Vliegtuig> geefVliegtuigen(){
        return vliegtuigen;
    }

}
