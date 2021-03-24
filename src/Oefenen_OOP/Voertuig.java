package Oefenen_OOP;

public abstract class Voertuig {
    private String type;
    protected int maximumSnelheid;
    protected int huidigeSnelheid;

    public Voertuig(String tp, int mS) {
        type = tp;
        maximumSnelheid = mS;
    }

    public abstract void snelheidVerhogen();
    public abstract void snelheidVerlagen();

    public String toString() {
        return "Type: " + type;
    }
}