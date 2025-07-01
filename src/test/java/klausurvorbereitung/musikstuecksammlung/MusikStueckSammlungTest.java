package klausurvorbereitung.musikstuecksammlung;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MusikStueckSammlungTest {

    @Test
    public void SortierungNachTitelundLaenge(){
        MusikStueckSammlung sammlung = new MusikStueckSammlung();
        sammlung.einfuegen(new MusikStueck("Durma", "Manifest", 146));
        sammlung.einfuegen(new MusikStueck("Snap", "Manifest", 120));
        sammlung.einfuegen(new MusikStueck("Manifest", "Manifest", 178));


        List<MusikStueck> titel= sammlung.getAllMusikStueckNachTitel();
        assertEquals("Durma", titel.get(0).titel);
        assertEquals("Manifest", titel.get(1).titel);
        assertEquals("Snap", titel.get(2).titel);


        List<MusikStueck> laenge= sammlung.getAllMusikStueckNachLaenge();
        assertEquals(120, laenge.get(0).laenge);
        assertEquals(146, laenge.get(1).laenge);
        assertEquals(178, laenge.get(2).laenge);


    }



    @Test

    public void DoppelterTitel(){
        MusikStueckSammlung sammlung = new MusikStueckSammlung();
        sammlung.einfuegen(new MusikStueck("Durma", "Manifest", 146));
        try{
            sammlung.einfuegen(new MusikStueck("Durma", "Irmak", 140));

            fail("Test failed");
        }catch(Exception e){
            assertEquals("", e.getMessage());
        }
    }


}