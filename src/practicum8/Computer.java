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

    @Override
    public boolean equals(Object obj){
        if (macAdres == obj){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "De computer: " + type + " met het productiejaar " + productieJaar + " is op dit moment €" + huidigeWaarde() + " waard.";
    }
}
