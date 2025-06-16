package uebungen.eigene.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Integer[] intarr= {1,2,3,4};
        Double[] doublearr= {1.1,2.2,3.3,4.4};
        Character[ ] chararr= {'1','2','3','4'};
        // auslesen(intarr);
        // auslesen(doublearr);
        // auslesen(chararr);

        GenClass<Double> generics = new GenClass();
        generics.setObjekt(15.3);
        System.out.println(generics.getObjekt());

    }
    // !!! önemli bilgi Generics sadece Wrapper klassen ile olur yani, int->Integer, double->Double
    public static <Type> void auslesen(Type[] array){
    for (Type i : array){
        System.out.print(i + " "); // i.getClass().getSimpleName() -> schreibt nur die Klassenamen
    }
    System.out.println();
    }
}
