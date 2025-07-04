package klausurvorbereitung.lieferung;

public class Elektrolieferwagen  extends Liefermittel implements Grüne{

    @Override
    public double berechneLieferung(Lieferung l){
        int dauer = l.min;
        if(dauer <= 30){
            return 0;
        }
        return (dauer - 30) * 0.30 + 0.10 * l.km;
    }

    @Override

    public void ladeAkku(){}


}
