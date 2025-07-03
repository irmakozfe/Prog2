package klausurvorbereitung.bibliothek;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibTest {

    @Test

    public void sortierung(){
        Bib bib = new Bib();

        bib.hinzufugen(new Buch("X", "A", "X", 2, 100));
        bib.hinzufugen(new Buch("X", "C", "X", 5, 100));
        bib.hinzufugen(new Buch("X", "B", "X", 3, 100));
        bib.hinzufugen(new Buch("A", "A", "X", 1, 100));
        bib.hinzufugen(new Buch("Z", "B", "X", 4, 100));


        List<Buch> sortiert= bib.sortiereBuecher();
        // expected-> AA, XA, XB, ZB, XC

        assertEquals(1, sortiert.get(0).PreisInCents );
        assertEquals(2, sortiert.get(1).PreisInCents );
        assertEquals(3, sortiert.get(2).PreisInCents );
        assertEquals(4, sortiert.get(3).PreisInCents );
        assertEquals(5, sortiert.get(4).PreisInCents );



    }
}