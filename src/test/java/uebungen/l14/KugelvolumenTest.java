package uebungen.l14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KugelvolumenTest {
    @Test
    void testKugelvolumen() {
        double actual = Kugelvolumen.berechneKugelvolumen(5);
        double expected = 4/3*Math.PI*5*5*5;
        assertEquals(expected, actual);
    }

    @Test
    void testRadiusNull(){
        double actual= Kugelvolumen.berechneKugelvolumen(0);
        double expected = 4/3*Math.PI*0*0*0;
        assertEquals(expected, actual);
    }


    @Test
    void testRadiusEins(){
        double actual = Kugelvolumen.berechneKugelvolumen(1);
        double expected= 4/3*Math.PI*1*1*1;
        assertEquals(expected, actual);
    }


    @Test
    void testNegativ(){

        try{
            Kugelvolumen.berechneKugelvolumen(-1);
            fail("Exception havent thrown");
        }catch(Exception e){
            assertEquals("Kugelvolumen kann nicht negativ sein", e.getMessage());
        }



    }

}