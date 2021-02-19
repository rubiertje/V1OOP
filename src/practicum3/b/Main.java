package practicum3.b;

public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}

/** Ik denk dat het bestand kapot gaat, want je gooit een foutmelding op en als je deze foutmelding niet opvangt dan gaat het programma dus kapot. Na het testen blijkt dat ook.**/