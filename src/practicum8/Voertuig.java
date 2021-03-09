package practicum8;

public abstract class Voertuig implements Goed{
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String type, double nieuwprijs, int bouwjaar){
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }

    @Override
    public abstract boolean equals(Object obj);

    public String toString(){
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: " + huidigeWaarde();
    }
}
