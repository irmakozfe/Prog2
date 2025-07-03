package klausurvorbereitung.bibliothek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bib {
    List<Buch> buecher;

    public Bib() {
        buecher = new ArrayList<>();
    }

    public void reiheHinzufuegen(List<Buch> reihe) {
        for (Buch b : reihe) {
            buecher.add(b);
        }
    }

    public void hinzufugen(Buch buch) {
        buecher.add(buch);
    }

    public List<Buch> sortiereBuecher() {
        Collections.sort(buecher, new BuchComparator());
        return buecher;
    }

    public static void main(String[] args) {
        Bib bib = new Bib();

        Reihe csm= new Reihe("Chainsawman Manga");

        csm.hinzufügen(new GebundenesBuch("Chainsaw Man Vol. 1" , "Fujimoto", "  " , 899, 192));
        csm.hinzufügen(new GebundenesBuch("Chainsaw Man Vol. 2" , "Fujimoto", "  " , 899, 192));
        csm.hinzufügen(new GebundenesBuch("Chainsaw Man Vol. 3" , "Fujimoto", "  " , 899, 192));
        csm.hinzufügen(new GebundenesBuch("Chainsaw Man Vol. 4" , "Fujimoto", "  " , 899, 192));

        bib.reiheHinzufuegen(csm.getBaende());
        bib.hinzufugen(new GebundenesBuch("Die Zwei Türme", "Tolkien", "Heyne", 1500,450));
        bib.hinzufugen(new GebundenesBuch("Die Zwei Türme", "Tolkien", "Heyne", 1500,450));
        bib.hinzufugen(new GebundenesBuch("Die Zwei Türme", "Tolkien", "Heyne", 1500,450));

        for(Buch b: bib.sortiereBuecher()) {
            System.out.println(b.name);
        }
    }

}
