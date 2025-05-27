package uebungen.l15.unternehmen;

public class Angestellter {
    String vorname;
    String nachname;
    String id;
    double grundgehalt;
    double gehaltsfaktor;
    String gdatum;
    double gehalt;

    public Angestellter(String vorname, String nachname, String id,
                        double grundgehalt,
                        String gdatum) {

        this.vorname = vorname;
        this.nachname = nachname;
        this.id = id;
        this.grundgehalt = grundgehalt;
        this.gehaltsfaktor = 1.0;
        this.gdatum = gdatum;
        this.gehalt= grundgehalt*gehaltsfaktor;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(double grundgehalt) {
        this.grundgehalt = grundgehalt;
    }

    public double getGehaltsfaktor() {
        return gehaltsfaktor;
    }

    public void setGehaltsfaktor(double gehaltsfaktor) {
        this.gehaltsfaktor = gehaltsfaktor;
    }

    public String getGdatum() {
        return gdatum;
    }

    public void setGdatum(String gdatum) {
        this.gdatum = gdatum;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
}
