package klausurvorbereitung.fahrt;

public class Kleintransporter extends Fahrzeug{

@Override
    public double berechneEngelt(Fahrt fahrt){
    int min = fahrt.min;
    if(fahrt.min <= 60){
        return 0.30 * fahrt.km;
    } else {
        return 0.25 * (min - 60) + 0.30 * fahrt.km ;
    }
}

}
