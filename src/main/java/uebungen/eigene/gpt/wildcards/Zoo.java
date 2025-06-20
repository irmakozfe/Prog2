package uebungen.eigene.gpt.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
    List<Tier> tiere = new ArrayList<>();
    tiere.add(new Hund("Marcil"));
    tiere.add(new Hund("Lane"));

    füttern(tiere);
    fuegeHundHinzu(tiere);
    füttern(tiere);


    }

    public static void füttern(List<? extends Tier> tiere){
        for (Tier tier : tiere) {
            tier.fuettern();
        }
    }


    public static void fuegeHundHinzu(List<? super Hund> liste){
        liste.add(new Hund("Luna"));

    }


}
