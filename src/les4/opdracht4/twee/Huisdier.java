package les4.opdracht4.twee;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht){
        this.gewicht = gewicht;
    }
    public String getNaam() { return naam; }
    public String getRas()  { return ras; }

    public String toString() {
        return naam + ", de " + ras + ", weegt " + gewicht + " kg.";
    }

}
