package practicum2.b;

public class Voetbalclub{
    private String naam;
    private int aantalGespeeld;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalPunten;

    public Voetbalclub(String naam){
        this.naam = naam;
    }

    public void verwerkResultaat(char ch){
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld(){
        aantalGespeeld = aantalGewonnen + aantalGelijk + aantalVerloren;
        return aantalGespeeld;
    }

    public int aantalPunten(){
        aantalPunten = aantalGewonnen*3 + aantalGelijk;
        return aantalPunten;
    }

    public String toString(){
        return naam + "   " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
