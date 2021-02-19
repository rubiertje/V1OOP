package les6.opdracht;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;

    Klant(String naam, String adres, String plaats){
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", plaats='" + plaats + '\'' +
                '}';
    }
}
