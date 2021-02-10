package AD_opdracht;

import java.util.ArrayList;

public class Fabrikant {
    private String naam;
    private static ArrayList<Fabrikant> alleFrabrikanten;
    private ArrayList<VliegtuigType> vliegtuigTypen;

    private static ArrayList<Fabrikant> geefAlle(){
        return alleFrabrikanten;
    }
    public ArrayList<VliegtuigType> geefVliegtuigTypen(){
        return vliegtuigTypen;
    }
}
