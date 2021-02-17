package practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;

    Klas (String klasCode){
        this.klasCode = klasCode;
        deLeerlingen = new ArrayList<Leerling>();
    }
    public void voegLeerlingToe(Leerling leerling){
        deLeerlingen.add(leerling);

    }
    public void wijzigCijfer(String naam, double nweCijfer){
        for (int i = 0; i < aantalLeerlingen(); i++){
            if (deLeerlingen.get(i).getNaam().equals(naam)) {
                deLeerlingen.get(i).setCijfer(nweCijfer);
                break;
            }
        }
    }
    public ArrayList<Leerling> getLeerlingen(){
        return deLeerlingen;
    }
    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }
    public String toString(){
        return "In de klas " + klasCode + "zitten de volgende leerlingen:\n" + getLeerlingen().toString().replace(", ", "").replace("[","").replace("]","");
    }
}