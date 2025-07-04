package klausurvorbereitung.lieferung;

public class Auto extends Liefermittel{

    @Override
    public double berechneLieferung(Lieferung l) {
        return 3 + l.km * 0.15;
    }

}
