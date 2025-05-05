package uebungen.l14;

public class Person {
    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, String nachname, Adresse adresse) {
        if(vorname.charAt(0) <='Z' && vorname.charAt(0) >='A' ) {
            this.vorname = vorname;
        }else{
            throw new RuntimeException("Vorname soll mit Großen Buchstabe beginnen");
        }
        this.nachname = nachname;
        this.adresse = adresse;
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

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }


}
