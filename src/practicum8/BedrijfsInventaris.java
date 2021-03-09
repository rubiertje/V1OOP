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
//        System.out.println(g.toString() + " 1");
        for (Goed goed: alleGoederen) {
//            System.out.println(goed.toString() + " 2");
            if (g.equals(goed)){
                System.out.println("joeeeee");
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
        StringBuilder gehele_inventaris = new StringBuilder("de hele inventaris:\n");
        for (Goed goed: alleGoederen) {
            gehele_inventaris.append(goed);
            gehele_inventaris.append("\n");
        }
        return gehele_inventaris.toString();
    }
}
