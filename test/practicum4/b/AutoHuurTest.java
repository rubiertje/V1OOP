package practicum4.b;

import org.junit.jupiter.api.BeforeEach;
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
     7. een auto met ongeldige invoer.
     8. een klant met ongeldige invoer.
     9. een huur met ongeldige invoer van de klant en de auto.
     **/
    private AutoHuur ah;
    private Auto a;
    private Auto ongeldigeAuto;
    private Klant k;
    private Klant ongeldigeKlant;

    @BeforeEach
    public void voorelketest(){
        this.ah = new AutoHuur();
        this.a = new Auto("Peugeot 207", 50);
        this.ongeldigeAuto = new Auto("",32);
        this.k = new Klant("Mijnheer de Vries");
        this.ongeldigeKlant = new Klant("");
    }

    @Test
    public void toStringGeenAutoGeenKlant(){
        assertEquals("  er is geen auto bekend\n  er is geen huurder bekend\n  aantal dagen: 0 en dat kost 0.0", ah.toString());
    }

    @Test
    public void toStringWelAutoGeenKlant(){
        ah.setGehuurdeAuto(a);
        assertEquals("  autotype: Peugeot 207 met prijs per dag: 50.0\n  er is geen huurder bekend\n  aantal dagen: 0 en dat kost 0.0", ah.toString());
    }

    @Test
    public void toStringGeenAutoWelKlantMetKorting(){
        ah.setHuurder(k);
        k.setKorting(10.0);
        assertEquals("  er is geen auto bekend\n  op naam van: Mijnheer de Vries (korting: 10.0%)\n  aantal dagen: 0 en dat kost 0.0", ah.toString());
    }

    @Test
    public void toStringGeenAutoWelKlantZonderKorting(){
        ah.setHuurder(k);
        assertEquals("  er is geen auto bekend\n  op naam van: Mijnheer de Vries (korting: 0.0%)\n  aantal dagen: 0 en dat kost 0.0", ah.toString());
    }

    @Test
    public void toStringWelAutoWelKlantMetKorting(){
        ah.setHuurder(k);
        k.setKorting(10.0);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(4);
        assertEquals("  autotype: Peugeot 207 met prijs per dag: 50.0\n  op naam van: Mijnheer de Vries (korting: 10.0%)\n  aantal dagen: 4 en dat kost 180.0", ah.toString());
    }

    @Test
    public void toStringWelAutoWelKlantZonderKorting(){
        ah.setHuurder(k);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(4);
        assertEquals("  autotype: Peugeot 207 met prijs per dag: 50.0\n  op naam van: Mijnheer de Vries (korting: 0.0%)\n  aantal dagen: 4 en dat kost 200.0", ah.toString());
    }

    @Test
    public void toStringInvoerNaamFout(){
        ah.setHuurder(ongeldigeKlant);
        ah.setGehuurdeAuto(a);
        assertEquals("  autotype: Peugeot 207 met prijs per dag: 50.0\n  er is geen huurder bekend\n  aantal dagen: 0 en dat kost 0.0", ah.toString());
    }
    @Test
    public void toStringInvoerAutoFout(){
        ah.setHuurder(k);
        ah.setGehuurdeAuto(ongeldigeAuto);
        ah.setAantalDagen(1);
        assertEquals("  er is geen auto bekend\n  op naam van: Mijnheer de Vries (korting: 0.0%)\n  aantal dagen: 1 en dat kost 0.0", ah.toString());
    }
    @Test
    public void toStringHelemaalFout(){
        ah.setHuurder(ongeldigeKlant);
        ah.setGehuurdeAuto(ongeldigeAuto);
        assertEquals("  er is geen auto bekend\n  er is geen huurder bekend\n  aantal dagen: 0 en dat kost 0.0", ah.toString());
    }


}