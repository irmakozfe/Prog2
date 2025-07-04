package klausurvorbereitung.lieferung;

public class Fahrradkurier extends Liefermittel {

    @Override
    public double berechneLieferung(Lieferung l){
     return l.km * 0.10 + l.min * 0.08;
    }

}
