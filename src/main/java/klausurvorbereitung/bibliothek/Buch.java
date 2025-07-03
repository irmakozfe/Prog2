package klausurvorbereitung.bibliothek;

public class Buch implements IBuch{

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

    @Override

    public String toString() {
        return name + " " + author + " " + verlag + " " + PreisInCents + " " + seitenzahl;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getAuthor(){
        return author;
    }

}
