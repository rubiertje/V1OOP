package les2.oefening;

public class Rekening {
    private int nummer;
    private Double saldo = 0.0;
    private Klant rekeninghouder;

    public Rekening(Integer nummer){
        this.nummer = nummer;
    }

    public void setRekeningHouder(Klant rekeningHouder){
        this.rekeninghouder = rekeningHouder;
    }

    public Klant getRekeninghouder() {
        return this.rekeninghouder;
    }

    public int getNummer(){
        return this.nummer;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void stort(double bedrag){
        saldo = saldo + bedrag;
    }

    public void neemOp(double bedrag){
        saldo = saldo - bedrag;
    }

    public String toString(){
        String rekeninginfo = "Op rekening " + nummer + " is het saldo: " + saldo;
        String rekeninghouderinfo = "";
        try{
            rekeninghouderinfo += "De rekeninghouder is onbekend";
        }catch (Exception e){
            rekeninghouderinfo += "Klantnaam: " + this.rekeninghouder.getNaam();
        }
        return rekeninginfo + "\n" + rekeninghouderinfo;
    }

}
