package les1.opdracht5;

public class Student {
    private String naam;
    private Integer studentnNummer;

    public Student(String nm)
    {
        naam = nm;
    }

    public Student(String nm, Integer stNr)
    {
        naam = nm;
        studentnNummer = stNr;
    }

    public String getNaam(){
        return naam;
    }

    public Integer getStudentNummer(){
        return studentnNummer;
    }

    public void setStudentNummer(int nwstNr){
        studentnNummer = nwstNr;
    }

    public String toString()
    {
        String s = "Deze student heet " + naam + " en heeft nummer: " + studentnNummer;
        return s;
    }
}
