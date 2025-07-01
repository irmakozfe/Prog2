package klausurvorbereitung.fahrt;

import java.util.ArrayList;
import java.util.List;

public class Umsatzberechner {
    public double berechneGemsamtumsatz(List<Fahrzeug> fahrzeuge) {
        double summe = 0.0;

        for(Fahrzeug f : fahrzeuge){
            summe += f.berechneGesamtEntgelt();
        }
        return summe;
    }


    public double berechneElektroUmsatz(List<Fahrzeug> fahrzeuge) {
        double summe = fahrzeuge.stream()
                .filter(fahrzeug -> fahrzeug.istElektro()) // (Fahrzeug::istElektro)
                .mapToDouble(Fahrzeug::berechneGesamtEntgelt)
                .sum();

        return summe;
    }
}
