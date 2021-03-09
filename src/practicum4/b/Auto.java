package practicum4.b;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag){
        if (type.equals("")){
            this.type = null;
        }else {
            this.type = type;
            this.prijsPerDag = prijsPerDag;
        }
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String toString() {
        if (this.type == null){
            return "er is geen auto bekend";
        }else {
            return "autotype: " + type + " met prijs per dag: " + prijsPerDag;
        }
    }
}
