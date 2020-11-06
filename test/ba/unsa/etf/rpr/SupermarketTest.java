package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtiklPrekoracenje() {
        Supermarket k= new Supermarket ();
        for(int i=0;i<1000;i++)
            k.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        boolean tip=k.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        assertFalse(tip);
    }
    @Test
    void dodajArtiklBezPrekoracenja() {
        Supermarket k= new Supermarket ();
        for(int i=0;i<900;i++)
            k.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        boolean tip=k.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        assertTrue(tip);
    }

    @Test
    void getArtikli() {
        Supermarket k= new Supermarket ();
        for(int i=0;i<40;i++)
            k.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        Supermarket k1=new Supermarket ();
        for(int i=0;i<40;i++)
            k1.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        assertArrayEquals(k1.getArtikli(),k.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket k= new Supermarket ();
        for(int i=0;i<40;i++)
            k.dodajArtikl(new Artikl ("Biciklo",100,((Integer)i).toString()));
        Artikl novo=k.izbaciArtiklSaKodom("3");
        assertEquals("3",novo.getKod());
    }
}