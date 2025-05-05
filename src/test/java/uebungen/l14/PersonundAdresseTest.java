package uebungen.l14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonundAdresseTest {

    @Test

    void testPersonErstellung(){
        Person person = new Person("Irmak", "Özdemir", new Adresse("Peter-Schneider Strasse", "71", 97074, "Würzburg" ));
        assertEquals("Irmak", person.getVorname());
        assertEquals("Özdemir", person.getNachname());
        assertEquals("Peter-Schneider Strasse", person.adresse.getStrasse());
        assertEquals("71", person.adresse.getHausnummer());
        assertEquals(97074, person.adresse.getPzl());
        assertEquals("Würzburg", person.adresse.getOrt());
    }


    @Test
    void testVorname() {
        try {
            Person person = new Person("ırmak", "Özdemir", new Adresse("Peter-Schneider Strasse", "71", 97074, "Würzburg" ));

            fail("Exception not thrown");
        } catch(Exception e) {
            assertEquals("Vorname soll mit Großen Buchstabe beginnen", e.getMessage());
        }

    }

    @Test
    void testStrasse() {
        try {
            Person person = new Person("Irmak", "Özdemir", new Adresse("peter-Schneider Strasse", "71", 97074, "Würzburg" ));
            fail("Exception not thrown");
        } catch(Exception e) {
            assertEquals("Strasse soll mit Großen Buchstabe beginnen", e.getMessage());
        }

    }

    @Test
    void testOrt() {
        try {
            Person person = new Person("Irmak", "Özdemir", new Adresse("Peter-Schneider Strasse", "71", 97074, "würzburg" ));
            fail("Exception not thrown");
        } catch(Exception e) {
            assertEquals("Ort soll mit Großen Buchstabe beginnen", e.getMessage());
        }

    }

    @Test
    void testHausnummer() {
        try {
            Person person = new Person("ırmak", "Özdemir", new Adresse("Peter-Schneider Strasse", "S1", 97074, "Würzburg" ));
            fail("Exception not thrown");
        } catch(Exception e) {
            assertEquals("Hausnummer soll mit Ziffer beginnen", e.getMessage());
        }

    }

}