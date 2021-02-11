package les2.oefening;

public class Main {
    public static void main(String[] args){
        Rekening r1 = new Rekening(43242234);
        Klant k1 = new Klant("Ruben van Rooijen", "jo", "Spakenburg");
        r1.stort(123.45);
        r1.setRekeningHouder(k1);
        System.out.println(r1.toString());
    }
}
