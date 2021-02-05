package practicum2.b;

public class Practicum2b {
    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax      ");
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + feij.getAantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.getAantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);
    }
}
