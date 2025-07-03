package klausurvorbereitung.bibliothek;

public class Hörbuch extends Buch{
    String sprecher;
    int min;

    public Hörbuch(String name, String autor, String verlag, int PreisInCents, int seitenZahl, String sprecher, int min) {
        super(name, autor, verlag, PreisInCents, seitenZahl);
        this.min = min;
        this.sprecher = sprecher;
    }


}
