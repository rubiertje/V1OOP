package practicum9.a;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String type, double prijs, int bouwjaar, String kenteken) {
        super(type, prijs, bouwjaar);
        this.kenteken = kenteken;
    }

    public double huidigeWaarde() {
        int jaarverschil = LocalDate.now().getYear() - bouwjaar;
        double prijs = nieuwprijs;
        for (int i = 0; i < jaarverschil; i++) {
            prijs *= 0.7;
        }
        return prijs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.equals(kenteken)) {
            return true;
        } else {
            return false;
        }
    }

}
