package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtiklPrekoracenje() {
        Korpa k= new Korpa ();
        for(int i=0;i<50;i++)
            k.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        boolean tip=k.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        assertFalse(tip);
    }
    @Test
    void dodajArtiklBezPrekoracenja() {
        Korpa k= new Korpa ();
        for(int i=0;i<40;i++)
            k.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        boolean tip=k.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        assertTrue(tip);
    }

    @Test
    void getArtikli() {
        Korpa k= new Korpa ();
        for(int i=0;i<40;i++)
            k.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        Korpa k1=new Korpa ();
        for(int i=0;i<40;i++)
            k1.dodajArtikl(new Artikl ("Biciklo",100,"10"));
        assertArrayEquals(k1.getArtikli(),k.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k= new Korpa ();
        for(int i=0;i<40;i++)
            k.dodajArtikl(new Artikl ("Biciklo",100,((Integer)i).toString()));
        Artikl novo=k.izbaciArtiklSaKodom("3");
        assertEquals("3",novo.getKod());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k= new Korpa ();
        int suma1=0;
        for(int i=0;i<40;i++) {
            k.dodajArtikl(new Artikl("Biciklo", 100, ((Integer) i).toString()));
            suma1=suma1+100;
        }
            int suma=k.dajUkupnuCijenuArtikala();
        assertEquals(suma1,suma);
    }
}