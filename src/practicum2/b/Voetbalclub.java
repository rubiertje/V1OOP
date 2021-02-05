package practicum2.b;

public class Voetbalclub {
    private String naam;
    private Integer aantalGespeeld = 0;
    private Integer aantalGewonnen = 0;
    private Integer aantalGelijk = 0;
    private Integer aantalVerloren = 0;
    private Integer aantalPunten = 0;

    public Voetbalclub(String naam){
        this.naam = naam;
    }

    public void verwerkResultaat(char ch){
        if (ch == 'w')
            this.aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            this.aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            this.aantalVerloren = aantalVerloren + 1;
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
