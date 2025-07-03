package klausurvorbereitung.bibliothek;

import java.util.ArrayList;
import java.util.List;

public class Reihe {
    String name;
    List<Buch> baende;

    public Reihe(String name) {
        this.name = name;
        this.baende= new ArrayList<>();
    }

    public void hinzufügen(Buch buch) {
        baende.add(buch);
    }

    public List<Buch> getBaende() {
        return baende;
    }



}
