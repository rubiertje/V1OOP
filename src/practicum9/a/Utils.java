package practicum9.a;

public class Utils {
    private static int aantalAangeroepen=0;

    public static String euroBedrag ( double bedrag){
        aantalAangeroepen ++;
        return String.format("%.2f", bedrag);
    }
    public static String euroBedrag ( double bedrag, int precisie){
        aantalAangeroepen ++;
        return String.format("%." + precisie + "f", bedrag);
    }
}
