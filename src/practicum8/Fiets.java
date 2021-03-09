package practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig{
    private int framenummer;

    public Fiets(String type, double prijs, int bouwjaar, int framenummer){
        super(type,prijs,bouwjaar);
        this.framenummer = framenummer;
    }

    public double huidigeWaarde(){
        int jaarverschil = LocalDate.now().getYear() - bouwjaar;
        double prijs = nieuwprijs;
        for (int i = 0; i < jaarverschil; i++) {
            prijs *= 0.9;
        }
        return prijs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.equals(framenummer)){
            return true;
        }else {
            return false;
        }
    }
}
