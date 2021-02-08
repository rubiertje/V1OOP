package les2.oefening;

public class Rekening {
    private Integer nummer;
    private Double saldo;

    public Rekening(Integer nummer, Double saldo){
        this.nummer = nummer;
        this.saldo = saldo;
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
