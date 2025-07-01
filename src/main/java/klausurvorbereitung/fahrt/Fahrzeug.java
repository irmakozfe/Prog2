package klausurvorbereitung.fahrt;

import java.util.ArrayList;
import java.util.List;

public abstract class Fahrzeug {
    List<Fahrt> fahrtenbuch= new ArrayList<>();

public void fuegeFahrtHinzu(Fahrt fahrt){
    fahrtenbuch.add(fahrt);
}

public abstract double berechneEngelt(Fahrt fahrt);

public double berechneGesamtEntgelt(){
    double summe=0.0;

    for(Fahrt f : fahrtenbuch){
        summe += berechneEngelt(f);
    }

    return summe;
}

public boolean istElektro(){
    return this instanceof Elektrofahrzeug;
}

}
