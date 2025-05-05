package uebungen.l14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest {

    @Test
    void testPunkt() {
        Punkt punkt = new Punkt();
        punkt.verschiebePunkt(10,2);
        assertEquals(punkt.x, 10);
        assertEquals(punkt.y, 2);
    }

    @Test
    void testNegativx(){
    Punkt punkt = new Punkt();
    try{
        punkt.verschiebePunkt(-1,2);
        fail("Exception not thrown");

    } catch (Exception e) {
        assertEquals("geht nicht", e.getMessage());
    }

    }

    @Test
    void testNegativy(){
        Punkt punkt = new Punkt();

        try{
            punkt.verschiebePunkt(10, -2);
            fail("Exception not thrown");

        }catch(Exception e){
            assertEquals("geht nicht", e.getMessage());
        }

    }

    @Test
    void testGroesserx(){
        Punkt punkt = new Punkt();
        try{
            punkt.verschiebePunkt(1921,2);
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("geht nicht", e.getMessage());
        }

    }


    @Test
    void testGroessery(){
        Punkt punkt = new Punkt();

        try{
            punkt.verschiebePunkt(3, 1081);
            fail("Exception not thrown");
        }catch(Exception e){
            assertEquals("geht nicht", e.getMessage());
        }

    }



}