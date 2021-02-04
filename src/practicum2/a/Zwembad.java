package practicum2.a;

public class Zwembad {
    private Double breedte;
    private Double lengte;
    private Double diepte;

    public Zwembad(Double breedte, Double lengte, Double diepte){
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }
    public Zwembad(){}

    public Double inhoud(){
        return breedte*diepte*lengte;
    }

    public void setBreedte(Double breedte){
        this.breedte = breedte;
    }

    public void setLengte(Double lengte){
        this.lengte = lengte;
    }

    public void setDiepte(Double diepte){
        this.diepte = diepte;
    }

    public Double getBreedte(){
        return breedte;
    }

    public Double getLengte(){
        return lengte;
    }

    public Double getDiepte(){
        return diepte;
    }

    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " + lengte +  " meter lang, en " + diepte + " meter diep";
    }
}
