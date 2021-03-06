package les7.opdracht7;

public class Vrachtwagen extends Voertuig{
    private int laadvermogen;

    public Vrachtwagen(){
        super();
        this.laadvermogen = 0;
    }
    public Vrachtwagen(String merk, int laadvermogen){
        super(merk);
        this.laadvermogen = laadvermogen;
    }
    public Vrachtwagen(String merk, String type, int laadvermogen) {
        super(merk, type);
        this.laadvermogen = laadvermogen;
    }
    public String toString(){
        return "Vrachtwagen." + "met een laadvermogen van " + laadvermogen + " ton";
    }

}

