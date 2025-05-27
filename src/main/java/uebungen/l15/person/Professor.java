package uebungen.l15.person;

public class Professor extends Person {

    public Professor(String vorname, String nachname, String fach) {
        super(vorname,nachname,fach);
    }

    @Override
    public String gibTaetigkeitAus(){
        return "Professor";
    }
}

