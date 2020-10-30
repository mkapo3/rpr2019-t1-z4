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

    public void ispisi(){
        System.out.println(naziv_artikla + " " + cijena + " " + kod);
    }
}
