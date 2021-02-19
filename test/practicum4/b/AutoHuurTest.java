package practicum4.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    /**
     Er zijn in totaal 6 verschillende testgevallen.
     De totaalprijs() functie wordt tijdens de toString() functie automatisch meegetest, omdat het in de string zit.
     wanneer er geen klant is, is er ook geen korting.
     er komt alleen een totaalprijs en aantal dagen wanneer er een klant en een auto is.
     1. een huur zonder auto en zonder klant.
     2. een huur met een auto, maar geen klant.
     3. een huur zonder auto, maar met een klant met korting.
     4. een huur zonder auto, maar met een kant zonder korting.
     5. een huur met een auto en met een klant met korting.
     6. een huur met een auto en met een klant zonder korting.
     **/
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