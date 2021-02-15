package practicum4.b;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur(){}

    public int getAantalDagen() {
        return aantalDagen;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public double totaalPrijs(){
        double prijs = aantalDagen * gehuurdeAuto.getPrijsPerDag();
        double korting = prijs * (1-huurder.getKorting()/100);
        return Math.round(korting);
    }

    public String toString(){
        if (gehuurdeAuto == null && huurder == null){
                return "  er is geen auto bekend\n  " + "er is geen huurder bekend\n" + "  aantal dagen: 0 en dat kost 0.0";
            }
        else if (gehuurdeAuto == null){
                return "  er is geen auto bekend\n  " + huurder.toString() + "\n" + "  aantal dagen: 0 en dat kost 0.0";
            }
        else if (huurder == null){
            return "  "+ gehuurdeAuto.toString() + "\n  " + "er is geen huurder bekend\n" + "  aantal dagen: 0 en dat kost 0.0";
        }
        else{
            return "  " + gehuurdeAuto.toString() + "\n  " + huurder.toString() + "\n" +"  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        }
    }
}
