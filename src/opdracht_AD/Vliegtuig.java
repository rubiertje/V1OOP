package opdracht_AD;

import java.time.LocalDate;

public class Vliegtuig {
    private String naam;
    private LocalDate datumInGebruik;
    private LuchtvaartMaatschappij lvm;
    private VliegtuigType vliegtuigType;

    public Vliegtuig(LuchtvaartMaatschappij lvm) {
        this.lvm = lvm;
    }
    private void zetVliegtuigType(VliegtuigType type){}
    private LocalDate geefDatumInGebruik(){}
    public void bewaar(){}
}
