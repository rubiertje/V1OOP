package practicum6.a;


import java.util.ArrayList;



public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> games;


    public Persoon(String naam, double budget){
        this.naam = naam;
        this.budget = budget;
        games = new ArrayList<>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g){
//        System.out.println(games);
//        System.out.println(g);
        for(int i = 0; i < games.size(); i++) {
            if (games.get(i).equals(g.getNaam()) && games.get(i).equals(g.getReleaseJaar())) {
                return false;

            }
        }
        if (budget >= g.huidigeWaarde()) {
            games.add(g);
            budget -= g.huidigeWaarde();
            return true;
        }

        return false;
        }

    public boolean verkoop(Game g, Persoon koper){
        for(int i = 0; i < games.size(); i++){
            if(games.get(i).equals(g.getNaam()) && games.get(i).equals(g.getReleaseJaar())){
                if(koper.games.size() == 0 && koper.budget > g.huidigeWaarde()){
                    koper.budget -= g.huidigeWaarde();
                    koper.games.add(g);
                    budget += g.huidigeWaarde();
                    games.remove(i);
                    return true;
                }
                for(int o = 0; o < koper.games.size(); o++){
                    if(koper.games.get(o).equals(g.getNaam()) && koper.games.get(o).equals(g.getReleaseJaar())){
                    }
                    else{
                        if(koper.budget > g.huidigeWaarde()){
                            koper.budget -= g.huidigeWaarde();
                            koper.games.add(g);
                            budget += g.huidigeWaarde();
                            games.remove(g);
                            return true;
                        }
                    }
                }
            }
        }

    return false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(naam + " heeft een budget van €" + String.format("%.2f", getBudget()) + " en bezit de volgende games:\n");
        for(Game game: games){
            sb.append(game);

        }
        if (games.size() == 0){
        return naam + " heeft een budget van €" + String.format("%.2f", getBudget()) + " en bezit de volgende games:\n";
    }
        else{
            return "" + sb;
        }


        }
}
