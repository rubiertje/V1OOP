package practicum11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String COLORRED = "\033[0;31m";
        String COLORGREEN = "\033[0;32m";
        String COLORWHITE = "\033[0;97m";
        String RESETCOLOR = "\033[0m";


        String bestandsnaam = "";
        while (true){
            System.out.println(COLORWHITE + "Welk bestand wil je uitlezen?" + RESETCOLOR);
            Scanner scanner = new Scanner(System.in);
            bestandsnaam = scanner.nextLine();
            try{
                if (Files.exists(Path.of(bestandsnaam))){
                    System.out.println(COLORGREEN + "Bestand " + bestandsnaam + " heeft u toegang gegeven!" + RESETCOLOR);
                    break;
                }else{
                    System.out.println(COLORRED + "Bestand bestaat niet!" + RESETCOLOR);
                }
            }catch (InvalidPathException e){
                System.out.println(COLORRED + "Je kunt geen 'spatie' in een bestand meegeven!" + RESETCOLOR);
            }

        }


        BufferedReader br = Files.newBufferedReader(Path.of(bestandsnaam));
        Scanner fileScanner = new Scanner(br);
        Path path;
        String filename;

        while (true) {
            try {
                System.out.println(COLORWHITE + "Naar welk bestand wilt u de info schrijven?" + RESETCOLOR);
                Scanner newfile = new Scanner(System.in);
                filename = newfile.nextLine();
                path = Path.of(filename);
                File file = new File(filename);
                if (file.createNewFile()) {
                    System.out.println(COLORGREEN + "Bestand " + filename + " is aangemaakt!" + RESETCOLOR);
                    break;
                } else {
                    System.out.println(COLORGREEN + "Bestand " + filename + " is geopend!" + RESETCOLOR);
                    break;
                }
            }catch (InvalidPathException e){
                System.out.println(COLORRED + "Je kunt geen 'spatie' in een bestand meegeven!" + RESETCOLOR);
            }
        }


        BufferedWriter out = Files.newBufferedWriter(path);

        double koers;
        while (true){
            System.out.println(COLORWHITE + "Welke waarde heeft 1 US dollar in Eurocenten?" + RESETCOLOR);
            Scanner waarde = new Scanner(System.in);
            try{
                koers = Double.parseDouble(waarde.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println(COLORRED + "De waarde moet een geldig getal zijn!" + RESETCOLOR);
            }

        }


        while (fileScanner.hasNext()){
            String regel = fileScanner.nextLine();

            int indexBeginBedrag= regel.indexOf(":")+2;
            double prijs = Double.parseDouble(regel.substring(indexBeginBedrag));

            String nieuwePrijs = String.valueOf(String.format("%.2f", prijs * (koers/100)));

            out.write(regel.substring(0,indexBeginBedrag) + nieuwePrijs + "\n");
        }
        System.out.println(COLORGREEN + "Het bestand " + filename + " is overschreven!" + RESETCOLOR);
        br.close();
        out.close();
    }
}
