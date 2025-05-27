package uebungen.l15.person;

public abstract class Person {
    String vorname, nachname, fach;

    public Person(String vorname, String nachname, String fach){
        this.vorname = vorname;
        this.nachname = nachname;
        this.fach = fach;
    }

    public String gibTaetigkeitAus(){
        return "";
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }
}
