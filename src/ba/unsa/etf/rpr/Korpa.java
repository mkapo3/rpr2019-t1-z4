package ba.unsa.etf.rpr;

public class Korpa {
    private final int kapacitet=50;
    private Artikl [] artikls = new Artikl [50];
    private int broj_artikala=0;

    public boolean dodajArtikl (Artikl a) {

        if(broj_artikala==50)
            return false;
        artikls[broj_artikala]=a;

        broj_artikala=broj_artikala+1;
        return true;
    }

    public Artikl[] getArtikli () {
        return artikls;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<broj_artikala; i++)

            if(artikls[i]!=null && (artikls[i].getKod()).equals(kod)) {
                Artikl ai=artikls[i];
                broj_artikala=broj_artikala-1;
                artikls[i]=null;
                return ai;
            }

            return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0; i<broj_artikala; i++)
            if(artikls[i]!=null)
            suma=suma+artikls[broj_artikala].getCijena();
        return suma;
    }
}
