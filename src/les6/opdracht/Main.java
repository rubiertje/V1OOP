package les6.opdracht;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Winkel w = new Winkel("Jumbo Utrecht Parkwijk");

        w.voegKlantToe(new Klant("Jan de wit", "Straatweg 54", "Edam"));
        w.voegKlantToe(new Klant("Kees de Bruin", "Lindelaan 12", "Abcoude"));

        System.out.println(w + "\n");

        System.out.println("De winkellijst bevat de volgende klanten:");

        ArrayList<Klant> klantenlijst = w.getKlanten();
        for(Klant klant : klantenlijst){
            System.out.println(klant);
        }

    }
}
