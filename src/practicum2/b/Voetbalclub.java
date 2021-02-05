package practicum2.b;

public class Voetbalclub{
    private String naam;
    private Integer aantalGespeeld;
    private Integer aantalGewonnen;
    private Integer aantalGelijk;
    private Integer aantalVerloren;
    private Integer aantalPunten;

    public Voetbalclub(String naam){
        this.naam = naam;
    }

    public void verwerkResultaat(char ch){
        if (aantalGewonnen == null)
            aantalGewonnen = 0;
        if (aantalGelijk == null)
            aantalGelijk = 0;
        if (aantalVerloren == null)
            aantalVerloren = 0;
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public Integer getAantalGespeeld(){
        if (aantalGewonnen == null)
            aantalGewonnen = 0;
        if (aantalGelijk == null)
            aantalGelijk = 0;
        if (aantalVerloren == null)
            aantalVerloren = 0;
        aantalGespeeld = aantalGewonnen + aantalGelijk + aantalVerloren;
        return aantalGespeeld;
    }

    public Integer getAantalPunten(){
        aantalPunten = aantalGewonnen*3 + aantalGelijk;
        return aantalPunten;
    }

    public String toString(){
        if (aantalGewonnen == null)
            aantalGewonnen = 0;
        if (aantalGelijk == null)
            aantalGelijk = 0;
        if (aantalVerloren == null)
            aantalVerloren = 0;
        return naam + "   " + getAantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + getAantalPunten();
    }
}
