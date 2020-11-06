package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getCijenaPogresno() {
        Artikl a = new Artikl ("Biciklo", 100, "10");
        assertNotEquals(1001, a.getCijena());
    }

    @Test
    void getCijenaIspravno() {
        Artikl a = new Artikl ("Biciklo", 100, "10");
        assertEquals(100, a.getCijena());
    }

    @Test
    void getNaziv() {
        Artikl a = new Artikl ("Biciklo", 100, "10");
        assertEquals("Biciklo", a.getNaziv());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl ("Biciklo", 100, "10");
        assertEquals("10", a.getKod());
    }
    @Test
    void konstruktror (){
        Artikl a = new Artikl ("Biciklo" , 100, "10");
        assertEquals("Biciklo",a.getNaziv());
        assertEquals(100,a.getCijena());
        assertEquals("10",a.getKod());
    }
}