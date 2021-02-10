package AD_opdracht;

public class VliegtuigType {
    private String code;
    private int capaciteit;
    private Fabrikant fabrikant;

    public VliegtuigType(String code, int capaciteit, Fabrikant fabrikant) {
        this.code = code;
        this.capaciteit = capaciteit;
        this.fabrikant = fabrikant;
    }

    public int geefCapaciteit(){
        return capaciteit;
    }
}
