package les2.oefening;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;

    public Klant(String naam, String adres, String plaats) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getPlaats() {
        return plaats;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", plaats='" + plaats + '\'' +
                '}';
    }
}
