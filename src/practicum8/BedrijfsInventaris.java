package practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String bedrijfsnaam, double budget){
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
        this.alleGoederen = new ArrayList<Goed>();
    }

    public void schafAan(Goed g){
        boolean aankoop = true;
        for (Goed goed: alleGoederen) {
            if (g.equals(goed)){
                aankoop = false;
            }
        }
        if (aankoop) {
            if (budget > g.huidigeWaarde()) {
                budget -= g.huidigeWaarde();
                alleGoederen.add(g);
            }
        }
    }

    public String toString(){
        StringBuilder gehele_inventaris = new StringBuilder("het gehele inventaris:\n");
        for (Goed goed: alleGoederen) {
            gehele_inventaris.append(goed).append("\n");
        }
        return gehele_inventaris.toString();
    }
}
