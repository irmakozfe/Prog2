package uebungen.l15.person;

public class Student extends Person {
    String vorname, nachname, fach;

    public Student( String vorname, String nachname, String fach) {
    super(vorname, nachname, fach);
    }

    @Override
    public String gibTaetigkeitAus(){
        return "Student";
    }


}
