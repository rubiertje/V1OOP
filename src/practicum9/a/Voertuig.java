package practicum9.a;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String type, double nieuwprijs, int bouwjaar){
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }

    public abstract boolean equals(Object obj);

    public String toString(){
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" + Utils.euroBedrag(huidigeWaarde());
    }
}
