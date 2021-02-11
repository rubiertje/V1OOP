package les4.opdracht4;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar eigenaar;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }
    public void setBaasje(Eigenaar e){
        this.eigenaar = e;
    }

    public Eigenaar getBaasje(){
        return eigenaar;
    }

    public String getNaam() { return naam; }
    public String getRas()  { return ras; }

    public String toString() {
        System.out.println(naam + ", de " + ras + ", weegt " + gewicht + " kg.");
        if (eigenaar != null) {
            return "en de eigenaar is " + eigenaar.toString();
        }else{return "en de eigenaar is null";}
    }

}
