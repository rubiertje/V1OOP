package les2.oefening;

public class Rekening {
    private int nummer;
    private Double saldo = 0.0;
    private Klant rekeninghouder;

    public Rekening(Integer nummer){
        this.nummer = nummer;
    }

    public void setRekeningHouder(Klant rekeninghouder){
        this.rekeninghouder = rekeninghouder;
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
            rekeninghouderinfo += "Klantnaam: " + this.rekeninghouder.getNaam();
        }catch (Exception e){
            rekeninghouderinfo += "De rekeninghouder is onbekend";
        }
        return rekeninginfo + "\n" + rekeninghouderinfo;
    }

}
