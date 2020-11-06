package ba.unsa.etf.rpr;

public class Supermarket {
    private final int kapacitet=1000;
    private Artikl [] artikls = new Artikl [1000];
    private int broj_artikala=0;

    public boolean dodajArtikl (Artikl t) {
        if(broj_artikala==kapacitet)
            return false;
        artikls[broj_artikala] = t;
        broj_artikala=broj_artikala+1;

        return true;
    }

    public Artikl[] getArtikli() {
        return artikls;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<broj_artikala; i++)

            if(artikls[i] != null && (artikls[i].getKod()).equals(kod)) {
                Artikl ai=artikls[i];
                broj_artikala=broj_artikala-1;
                artikls[i]=null;
                return ai;
            }

            return null;
    }
}
