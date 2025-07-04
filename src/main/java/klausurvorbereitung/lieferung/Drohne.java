package klausurvorbereitung.lieferung;

public class Drohne extends Liefermittel{

    @Override
    public double berechneLieferung(Lieferung l){
        return l.km * 0.20 + l.min * 0.20;
    }
}
