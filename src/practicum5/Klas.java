package practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    Klas (String klasCode){
        this.klasCode = klasCode;
        leerlingen = new ArrayList<Leerling>();
    }
    public void voegLeerlingToe(Leerling leerling){
        leerlingen.add(leerling);

    }
    public void wijzigCijfer(String naam, double nweCijfer){
        for (Leerling l : leerlingen){
            System.out.println(l);
            if (l.getNaam().equals(naam)) {
                l.setCijfer(nweCijfer);
                break;
            }
        }
    }
    public ArrayList<Leerling> getLeerlingen(){
        return leerlingen;
    }
    public int aantalLeerlingen(){
        return leerlingen.size();
    }
    public String toString(){
        return "In de klas " + klasCode + "zitten de volgende leerlingen:\n" + getLeerlingen().toString().replace(", ", "").replace("[","").replace("]","");
    }
}
