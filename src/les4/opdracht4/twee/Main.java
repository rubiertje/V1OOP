package les4.opdracht4.twee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        ArrayList<Huisdier> huisdieren = new ArrayList<Huisdier>();
        Eigenaar e1 = new Eigenaar("Willem de Moller");

        Huisdier hd1 = new Huisdier("ruben", "mens");
        hd1.setGewicht(70.0);
        huisdieren.add(hd1);

        Huisdier hd2 = new Huisdier("dfjkal", "Dobbermann");
        e1.setBeestje(hd2);
        huisdieren.add(hd2);

        huisdieren.add(new Huisdier("zaza", "kakkerlak"));

        System.out.println("De lengte van de lijst: " + huisdieren.size());
        System.out.println();


        for (int i = 0; i < huisdieren.size(); i++){
            System.out.println("Huisdiernummer " + i + ": " + huisdieren.get(i));
        }

        System.out.println();

        huisdieren.add(0,new Huisdier("jo", "poes"));

        huisdieren.set(2,hd1);

        System.out.println(huisdieren);
    }
}
