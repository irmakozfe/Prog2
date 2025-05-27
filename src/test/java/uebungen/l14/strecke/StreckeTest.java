package uebungen.l14.strecke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreckeTest {

    @Test
    void testAB(){

        try{
            Strecke strecke= new Strecke(5,3);
            fail("Exception havent thrown");
        }catch(Exception e){
            assertEquals("B soll groesser als A sein", e.getMessage());
        }
    }

    @Test
    void testToString(){
        Strecke s =  new Strecke(1,6);
        String actual = s.toString();
        String expected = "1-----6";

        assertEquals(expected,actual);

    }

    @Test
    void testUeberschneiden(){
        Strecke s= new Strecke(2,6);
        Strecke s2= new Strecke(1,5);
        Strecke s3= new Strecke(3,7);
        Strecke s4= new Strecke(2,6);
        Strecke s5= new Strecke(1,2);
        Strecke s6= new Strecke(6,7);

        assertEquals( true, s.ueberschneiden(s2));
        assertEquals( true, s.ueberschneiden(s3));
        assertEquals( true, s.ueberschneiden(s4));
        assertEquals( false, s.ueberschneiden(s5));
        assertEquals( false, s.ueberschneiden(s6));




    }


}