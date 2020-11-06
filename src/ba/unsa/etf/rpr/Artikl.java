package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv_artikla;
    private int cijena;
    private String kod;

    public Artikl (String naziv, int cijena, String kod){
        this.naziv_artikla=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }

    public String getNaziv() {
        return naziv_artikla;
    }

    public String getKod() {
        return kod;
    }

    public int getCijena() {
        return cijena;
    }

    @Override
    public boolean equals (Object a){
        if(this.getCijena()==((Artikl)a).getCijena() && this.getKod()==((Artikl)a).getKod()
                && this.getNaziv()==((Artikl)a).getNaziv()) return true;
        return false;
    }

}
