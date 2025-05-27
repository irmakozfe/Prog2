package uebungen.l15.unternehmen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbleitungsleiterTest {

    Angestellter angestellter = new Angestellter("Elif", "Özdal", "1234", 2000.0, "28-05-2003" );
    Ableitungsleiter ableitungsleiter= new Ableitungsleiter("Annika", "Özdemir", "2345", 4000.0, "13-08-2000");

    @Test

    public void testBefoerden(){



        ableitungsleiter.befoerdern(angestellter);
        double expected= angestellter.gehaltsfaktor * angestellter.grundgehalt;


        assertEquals(1.1, angestellter.gehaltsfaktor, 0.001);
        assertEquals(expected,angestellter.gehalt, 0.001);

    }


    @Test

    public void angestellterTest(){
        assertEquals(angestellter.getVorname(), angestellter.vorname);
        assertEquals(angestellter.getNachname(), angestellter.nachname);
        assertEquals(angestellter.getGehaltsfaktor(), angestellter.gehaltsfaktor);
        assertEquals(angestellter.getGrundgehalt(), angestellter.grundgehalt);
        assertEquals(angestellter.getId(), angestellter.id);
        assertEquals(angestellter.getGehalt(), angestellter.gehalt);

    }


    @Test

    public void ableitungleiterTest(){
        assertEquals(ableitungsleiter.getVorname(), ableitungsleiter.vorname);
        assertEquals(ableitungsleiter.getNachname(), ableitungsleiter.nachname);
        assertEquals(ableitungsleiter.getGehaltsfaktor(), ableitungsleiter.gehaltsfaktor);
        assertEquals(ableitungsleiter.getGrundgehalt(), ableitungsleiter.grundgehalt);
        assertEquals(ableitungsleiter.getId(), ableitungsleiter.id);
        assertEquals(ableitungsleiter.getGehalt(), ableitungsleiter.gehalt);

    }

}