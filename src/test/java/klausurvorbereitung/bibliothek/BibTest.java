package klausurvorbereitung.bibliothek;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibTest {

    @Test
    void sortierung(){
        Bib bib = new Bib();

        bib.hinzufugen(new Buch("X", "A", "X", 2, 100));
        bib.hinzufugen(new Buch("X", "C", "X", 5, 100));
        bib.hinzufugen(new Buch("X", "B", "X", 3, 100));
        bib.hinzufugen(new Buch("A", "A", "X", 1, 100));
        bib.hinzufugen(new Buch("Z", "B", "X", 4, 100));



        // expected-> AA, XA, XB, ZB, XC List<Buch> sortiert= bib.sortiereBuecher();

        assertEquals(1, bib.buecher.get(0).PreisInCents );
        assertEquals(2, bib.buecher.get(1).PreisInCents );
        assertEquals(3, bib.buecher.get(2).PreisInCents );
        assertEquals(4, bib.buecher.get(3).PreisInCents );
        assertEquals(5, bib.buecher.get(4).PreisInCents );



    }
}