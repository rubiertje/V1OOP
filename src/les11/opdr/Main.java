package les11.opdr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Path p = Path.of("./invoeren.txt");

        BufferedWriter out = Files.newBufferedWriter(p, StandardOpenOption.APPEND);

        for (int i = 0; i <5; i++){
            out.write(""+ Math.random());
            out.newLine();
        }

        out.close();

        List<String> s = Files.readAllLines(p);
        System.out.println(s);
        double gemiddelde = 0;
        for (String deel: s){
            double getal = Double.parseDouble(deel);
            System.out.println(getal);
            gemiddelde += getal;
        }

        System.out.println("aantal getallen: "+ s.size());

        System.out.println("totaal: " + gemiddelde);

        System.out.println("Gemiddelde : " + gemiddelde/s.size());



    }
}
