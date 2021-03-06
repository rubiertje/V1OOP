package practicum6.a;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;

    Persoon(String naam, double budget){
        this.naam = naam;
        this.budget = budget;
        mijnGames = new ArrayList<Game>();
    }

    public double getBudget(){
        return budget;
    }

    public boolean koop(Game game){
        for (int i=0; i < mijnGames.size(); i++) {
            if (mijnGames.get(i).equals(game)){
                return false;
            }
        }
        if (game.huidigeWaarde() < budget){
            this.budget -= game.huidigeWaarde();
            mijnGames.add(game);
            return true;
        }
        return false;
    }

    public boolean verkoop (Game game, Persoon koper) {
        for (int i = 0; i < mijnGames.size(); i++) {
            if (mijnGames.get(i).equals(game)) {
                if (koper.mijnGames.size() == 0){
                    if (koper.budget > game.huidigeWaarde()) {
                        koper.budget -= game.huidigeWaarde();
                        budget += game.huidigeWaarde();
                        mijnGames.remove(game);
                        koper.mijnGames.add(game);
                        return true;
                    }
                }
                for (Game game2 : koper.mijnGames) {
                    if (game2.equals(game)) {
                    } else {
                        if (koper.budget > game.huidigeWaarde()) { ;
                            koper.budget -= game.huidigeWaarde();
                            budget += game.huidigeWaarde();
                            mijnGames.remove(game);
                            koper.mijnGames.add(game);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder s = new StringBuilder(naam + " heeft een budget van €" + String.format("%.2f", getBudget()) + " en bezit de volgende games:");
        for (Game game : mijnGames){
            s.append(game);
        }
        return s.toString();
    }
}
