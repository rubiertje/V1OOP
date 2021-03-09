package practicum8;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris bi1 = new BedrijfsInventaris("LAB31", 24000.00);

        Computer c1 = new Computer("Desktop", "00:0a:95:9d:68:16", 1200.00, 2020);
        Computer c2 = new Computer("Desktop", "00:0a:95:9d:68:16", 1200.00, 2020);

        Fiets f1 = new Fiets("Stads Fiets", 300, 2021, 84567);
        Fiets f2 = new Fiets("Stads Fiets", 300, 2021, 84567);

        Auto a1 = new Auto("Tesla Cybertruck", 10, 2020, "DAD-EM-12");
        Auto a2 = new Auto("Tesla Cybertruck", 10, 2020, "DAD-EM-12");

        Computer c3 = new Computer("Laptop", "00:0a:90:9c:62:18", 750.00, 2015);
        Fiets f3 = new Fiets("Oma Fiets", 1565, 2018, 4);
        Auto a3 = new Auto("Super snelle coole auto", 12560, 2020, "DAD-EM-12");

        bi1.schafAan(c1);
        bi1.schafAan(c2);
        bi1.schafAan(c3);
        bi1.schafAan(a1);

        System.out.println(bi1);
    }
}
