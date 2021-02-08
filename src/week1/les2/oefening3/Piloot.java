package week1.les2.oefening3;

public class Piloot {
    private String naam;
    private Double salaris;
    private int vlieguren;

    public Piloot(String naam){
        this.naam = naam;
    }

    public void setSalaris(Double salaris){
        this.salaris = salaris;
    }
    public void verhoogVliegurenMet(int extra){
        vlieguren += extra;
    }
    public int getVlieguren(){
        return vlieguren;
    }
    public Double getSalaris(){
        return salaris;
    }
    public String toString(){
        return naam + " heeft " + getVlieguren() + " vlieguren gemaakt en verdient " + getSalaris();
    }
}
