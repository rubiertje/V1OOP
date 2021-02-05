package practicum2.b;

public class Voetbalclub {
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
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public Integer getAantalGespeeld(){
        if (aantalGespeeld == null)
            aantalPunten = 0;
        return aantalGespeeld;
    }

    public Integer getAantalPunten(){
        if (aantalPunten == null)
            aantalPunten = 0;
        return aantalPunten;
    }
}
