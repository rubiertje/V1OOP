package les2.oefening;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;
    private Rekening mijnRekening;

    public Klant(String naam, String adres, String plaats) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    public Rekening getMijnRekening() {
        return mijnRekening;
    }

    public void setMijnRekening(Rekening mijnRekening) {
        this.mijnRekening = mijnRekening;
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
        String klantinfo = getNaam() + " woont in " + plaats;
        String rekeninginfo = this.mijnRekening + " ";
        return klantinfo + "\n" + rekeninginfo;
    }
}
