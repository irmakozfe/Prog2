package uebungen.l14;

public class Adresse{
    String strasse;
    String hausnummer;
    int pzl;
    String ort;


    public Adresse(String strasse, String hausnummer, int pzl, String ort) {

        if(strasse.charAt(0) <='Z' && strasse.charAt(0) >='A' ) {
            this.strasse = strasse;

        }else{
            throw new RuntimeException("Strasse soll mit Großen Buchstabe beginnen");
        }

        if(ort.charAt(0) <='Z' && ort.charAt(0) >='A' ) {
            this.ort = ort;
        } else{
            throw new RuntimeException("Ort soll mit Großen Buchstabe beginnen");
        }


        if(hausnummer.charAt(0) <= '9' && hausnummer.charAt(0) >= '0' ) {
            this.hausnummer = hausnummer;
        }else{
            throw new RuntimeException("Hausnummer soll mit Ziffer beginnen");
        }

        this.pzl = pzl;

    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public int getPzl() {
        return pzl;
    }

    public void setPzl(int pzl) {
        this.pzl = pzl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
