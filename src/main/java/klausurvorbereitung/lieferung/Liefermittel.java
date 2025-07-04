package klausurvorbereitung.lieferung;

import java.util.ArrayList;
import java.util.List;

public abstract class Liefermittel {
    List<Lieferung> lieferungList= new ArrayList<>();

    public abstract double berechneLieferung(Lieferung lieferung);


    public double berechneAlleLieferung(){
        double summe=0.0;
        for(Lieferung l: lieferungList){
            summe+= berechneLieferung(l);
        }

        return summe;
    }

    public boolean istGrün(){
        return this instanceof Grüne;
    }



}
