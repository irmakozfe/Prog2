package klausurvorbereitung.iban;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IBANTest {

    @Test
    void checkIBANgueltig(){
        assertTrue(IBAN.checkIban("DE22100100500123456789"));
    }

    @Test
    void checkIBANungueltig(){
        try{
            IBAN.checkIban("DE221001005001234");
            fail("Erwartete Exception nicht geworfen");
        }catch (FalscheIBANException e){
            assertEquals("Invalid IBAN format",e.getMessage());
        }
    }


    //dieses Code-Block ist problematisch
    @Test
    void testliesAusDatei(){
        String datei = "DE221001005001234";
        List<String> gultige= IBAN.liesIBANAusDatei(datei);
        gultige.add(datei);
        assertEquals(1,gultige.size());
        assertEquals(gultige.get(0), "DE221001005001234");
    }

}