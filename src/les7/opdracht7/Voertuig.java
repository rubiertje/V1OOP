package les7.opdracht7;

public class Voertuig {
    private String merk;
    private String type;

    public Voertuig(){
        this("onbekend", "onbekend");
    }
    public Voertuig(String merk, String type){
        this.merk = merk;
        this.type = type;
    }

    public Voertuig(String merk) {
        this.merk = merk;
        this.type = "onbekend";
    }
    Voertuig v3 = new Voertuig("Ford", "Fiesta");

    public String toString(){
        return "merk: " + merk + "type: " + type;
    }
}

