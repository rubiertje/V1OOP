package practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen;


    public StringProcessor() {
        processen = new ArrayList<OpmaakProces>();
    }

    public String verwerk(String input){
        for (OpmaakProces proces : processen) {
            input = proces.maakOp(input);
            }
        return input;
    }

    public void voegProcesToe(OpmaakProces proces){
            processen.add(proces);
    }
}
