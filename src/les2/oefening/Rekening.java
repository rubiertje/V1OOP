package les2.oefening;

public class Rekening {
    private int nummer;
    private Double saldo = 0.0;

    public Rekening(Integer nummer){
        this.nummer = nummer;
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
        return "Op rekening " + nummer + " is het saldo: " + saldo;
    }

}
