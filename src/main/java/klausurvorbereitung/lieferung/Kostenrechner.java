package klausurvorbereitung.lieferung;

import java.util.List;

public class Kostenrechner {
    double summe = 0.0;

    public double berechneGesamtKosten(List<Liefermittel> liefermittels){

        for(Liefermittel l: liefermittels){
            summe+= l.berechneAlleLieferung();
        }
        return summe;
    }

    public double berechneGrüneKosten(List<Liefermittel> liefermittels){

        return liefermittels.stream()
                .filter(l -> l.istGrün())
                .mapToDouble(l -> l.berechneAlleLieferung())
                .sum();

    }


}
