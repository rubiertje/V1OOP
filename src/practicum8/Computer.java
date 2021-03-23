package practicum8;

import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar){
        this.type = type;
        this.macAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }


    public double huidigeWaarde(){
        int jaarverschil = LocalDate.now().getYear() - productieJaar;
        double prijs = aanschafPrijs;
        for (int i = 0; i < jaarverschil; i++) {
            prijs *= 0.6;
        }
        return prijs;
    }

    public boolean equals(Object obj){
        if (obj instanceof Computer){
            Computer computer = (Computer) obj;
            if (macAdres.equals(computer.macAdres)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "Computer: " + type + " met het productiejaar " + productieJaar + " heeft een waarde van €" + String.format("%.2f", huidigeWaarde());
    }
}
