package klausurvorbereitung.bibliothek;

public class Buch {

    String name;
    String author;
    String verlag;
    int PreisInCents;
    int seitenzahl;

    public Buch(String name, String author, String verlag, int PreisInCents, int seitenzahl) {
        this.name = name;
        this.author = author;
        this.verlag = verlag;
        this.PreisInCents = PreisInCents;
        this.seitenzahl = seitenzahl;
    }


}
