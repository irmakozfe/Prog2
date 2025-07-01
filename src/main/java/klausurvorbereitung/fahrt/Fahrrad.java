package klausurvorbereitung.fahrt;

public class Fahrrad extends Fahrzeug{

    @Override
    public double berechneEngelt(Fahrt fahrt){
        return 0.125 * fahrt.min; // 12.5 cent pro min
    }

}
