package practicum8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private BedrijfsInventaris bestewinkel;
    private Computer c1;
    private Computer c2;
    private Auto a1;
    private Auto a2;
    private Fiets f1;
    private Fiets f2;
    private Auto veelteduur;
    @BeforeEach
    public void initialize(){
        this.bestewinkel = new BedrijfsInventaris("Ruben_store", 120000.00);

        this.c1 = new Computer("Laptop", "00:32:95:3j:68:16", 1000.00, 2019);
        this.c2 = new Computer("Laptop", "00:32:95:3j:68:16", 1000.00, 2019);

        this.a1 = new Auto("Jaguar F-Type", 54000.00, 2020, "SKK-01-JO");
        this.a2 = new Auto("Jaguar F-Type", 54000.00, 2020, "SKK-01-JO");;

        this.f1 = new Fiets("Mountainbike", 600, 2020, 7854392);
        this.f2 = new Fiets("Mountainbike", 600, 2020, 7854392);

        this.veelteduur = new Auto("Ferrari Exclusive", 2000000.00, 2020, "SKK-01-RR");
    }

    @Test
    public void tweeComputers(){
        bestewinkel.schafAan(c1);
        bestewinkel.schafAan(c2);
        assertEquals("het gehele inventaris:\nDe computer: Laptop met het productiejaar 2019 heeft een waarde van €360,00\n",bestewinkel.toString());
    }

    @Test
    public void tweeAutos(){
        bestewinkel.schafAan(a1);
        bestewinkel.schafAan(a2);
        assertEquals("het gehele inventaris:\nVoertuig: Jaguar F-Type met bouwjaar 2020 heeft een waarde van: €37800,00\n", bestewinkel.toString());
    }

    @Test
    public void tweeFietsen(){
        bestewinkel.schafAan(f1);
        bestewinkel.schafAan(f2);
        assertEquals("het gehele inventaris:\nVoertuig: Mountainbike met bouwjaar 2020 heeft een waarde van: €540,00\n", bestewinkel.toString());
    }

    @Test
    public void teLaagBudget(){
        bestewinkel.schafAan(veelteduur);
        assertEquals("het gehele inventaris:\n",bestewinkel.toString());
    }

    @Test
    public void huidigeWaardeComputer(){
        assertEquals(360.00,c1.huidigeWaarde());
    }

    @Test
    public void huidigeWaardeAuto(){
        assertEquals(37800.00,a1.huidigeWaarde());
    }

    @Test
    public void huidigeWaardeFiets(){
        assertEquals(540.00,f1.huidigeWaarde());
    }
}