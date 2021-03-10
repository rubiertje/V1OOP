package practicum8;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris bestewinkel = new BedrijfsInventaris("Ruben_store", 120000.00);

        Computer c1 = new Computer("Laptop", "00:32:95:3j:68:16", 1000.00, 2019);
        Computer c2 = new Computer("Laptop", "00:32:95:3j:68:16", 1000.00, 2019);

        Auto a1 = new Auto("Jaguar F-Type", 54000.00, 2020, "SKK-01-JO");
        Auto a2 = new Auto("Jaguar F-Type", 54000.00, 2020, "SKK-01-JO");

        Fiets f1 = new Fiets("Mountainbike", 600, 2020, 7854392);
        Fiets f2 = new Fiets("Mountainbike", 600, 2020, 7854392);

        Computer c3 = new Computer("Desktop", "00:0a:99:4r:87:23", 2000.00, 2018);
        Fiets f3 = new Fiets("Race fiets", 200.00, 2018, 67582349);
        Auto a3 = new Auto("Opel Grandland X", 40000.00, 2019, "FRG-67-NMR");

        Auto veelteduur = new Auto("Ferrari Exclusive", 2000000.00, 2020, "SKK-01-RR");

        bestewinkel.schafAan(c1);
        bestewinkel.schafAan(c2);
        bestewinkel.schafAan(a1);
        bestewinkel.schafAan(a2);
        bestewinkel.schafAan(f1);
        bestewinkel.schafAan(f2);
        bestewinkel.schafAan(c3);
        bestewinkel.schafAan(f3);
        bestewinkel.schafAan(a3);
        bestewinkel.schafAan(veelteduur);

        System.out.println(bestewinkel);
    }
}
