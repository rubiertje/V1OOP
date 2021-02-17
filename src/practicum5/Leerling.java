package practicum5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String naam){
        this.naam = naam;
    }
    public String getNaam(){
        return naam;
    }
    public double getCijfer(){
        return cijfer;
    }
    public void setCijfer(double c){
        this.cijfer = c;
    }
    public String toString(){
        return getNaam() + " heeft cijfer: " + getCijfer() + "\n";
    }
}
