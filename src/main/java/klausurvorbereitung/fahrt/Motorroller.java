package klausurvorbereitung.fahrt;

public class Motorroller extends Fahrzeug {

    @Override
    public double berechneEngelt(Fahrt fahrt) {
        return 3 + 0.15 * fahrt.km;
    }


}
