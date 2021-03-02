package practicum6.a;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwPrijs;

    public Game(String naam, int releaseJaar, double nieuwPrijs){
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.nieuwPrijs = nieuwPrijs;
    }

    public String getNaam() {
        return naam;
    }
    public double huidigeWaarde(){
        double huidigeWaarde = nieuwPrijs;
        int jaar = 2021 - releaseJaar;
        for(int i = 0; i < jaar; i++){
            huidigeWaarde *= 0.70;
        }
        return huidigeWaarde;
    }

    public int getReleaseJaar() {
        return releaseJaar;
    }

    public boolean equals(Object andereObject){
        String rJ = String.valueOf(releaseJaar);
        if(andereObject == getNaam() || andereObject.equals(releaseJaar)){
            return true;
        }
        return false;

    }

    public String toString(){
        return naam + ", uitgegeven in " + releaseJaar + ";" + " nieuwprijs: €" + String.format("%.2f", nieuwPrijs) +
                " nu voor €: " + String.format("%.2f", huidigeWaarde()) + "\n";
    }
}
