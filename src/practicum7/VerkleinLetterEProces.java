package practicum7;

public class VerkleinLetterEProces implements OpmaakProces{
    public VerkleinLetterEProces(){}

    public String maakOp(String input){
        return input.replace("E", "e");
    }
}
