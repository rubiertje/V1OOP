package AD_opdracht;

import java.time.LocalDate;

public class Vliegtuig {
    private String naam;
    private LocalDate datumInGebruik;
    private LuchtvaartMaatschappij lvm;
    private VliegtuigType vliegtuigType;

    public Vliegtuig(LuchtvaartMaatschappij lvm) {
        this.lvm = lvm;
    }
    private void zetVliegtuigType(VliegtuigType type){
        this.vliegtuigType = type;
    }
    private LocalDate geefDatumInGebruik(){
        return datumInGebruik;
    }
    public void bewaar(){
//        idk...
    }
}
