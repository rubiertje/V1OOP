package practicum9.a;

import java.util.Optional;
import java.util.OptionalInt;

public class Utils {
    private static int aantalAangeroepen=0;

    public static String euroBedrag (double bedrag, int precisie){
        aantalAangeroepen ++;
        return String.format("%." + precisie + "f", bedrag);
    }

    public static String euroBedrag ( double bedrag){
        return euroBedrag(bedrag,2);
    }

    public static int getAantalAangeroepen(){
        return aantalAangeroepen;
    }
}
