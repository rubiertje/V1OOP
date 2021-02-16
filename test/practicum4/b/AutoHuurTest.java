package practicum4.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    @Test
    public void toStringGeenAutoGeenKlant(){
        AutoHuur ah1 = new AutoHuur();
        assertEquals("  er is geen auto bekend\n  er is geen huurder bekend\n  aantal dagen: 0 en dat kost 0.0", ah1.toString());
    }

    @Test
    public void toStringWelAutoGeenKlant(){
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        assertEquals("  autotype: Peugeot 207 met prijs per dag: 50.0\n  er is geen huurder bekend\n  aantal dagen: 0 en dat kost 0.0", ah1.toString());
    }

    @Test
    public void toStringGeenAutoWelKlantMetKorting(){
        AutoHuur ah1 = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        ah1.setHuurder(k);
        k.setKorting(10.0);
        assertEquals("  er is geen auto bekend\n  op naam van: Mijnheer de Vries (korting: 10.0%)\n  aantal dagen: 0 en dat kost 0.0", ah1.toString());
    }

    @Test
    public void toStringGeenAutoWelKlantZonderKorting(){
        AutoHuur ah1 = new AutoHuur();
        Klant k = new Klant("Mijnheer de Vries");
        ah1.setHuurder(k);
        assertEquals("  er is geen auto bekend\n  op naam van: Mijnheer de Vries (korting: 0.0%)\n  aantal dagen: 0 en dat kost 0.0", ah1.toString());
    }

    @Test
    public void toStringWelAutoWelKlantMetKorting(){
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50);
        Klant k = new Klant("Mijnheer de Vries");
        ah1.setHuurder(k);
        k.setKorting(10.0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        assertEquals("  autotype: Peugeot 207 met prijs per dag: 50.0\n  op naam van: Mijnheer de Vries (korting: 10.0%)\n  aantal dagen: 4 en dat kost 180.0", ah1.toString());
    }

    @Test
    public void toStringWelAutoWelKlantZonderKorting(){
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50);
        Klant k = new Klant("Mijnheer de Vries");
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        assertEquals("  autotype: Peugeot 207 met prijs per dag: 50.0\n  op naam van: Mijnheer de Vries (korting: 0.0%)\n  aantal dagen: 4 en dat kost 200.0", ah1.toString());
    }
}