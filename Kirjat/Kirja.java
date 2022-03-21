public class Kirja {
    private String nimi;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return this.nimi;
    }

    public int getJulkaisuvuosi() {
        return this.julkaisuvuosi;
    }

   
    public String toString() {
        return this.nimi + " (" + this.julkaisuvuosi + ")";
    }

    
    public boolean equals(Object olio) {
        if (olio == null) {
            return false;
        }

        if (getClass() != olio.getClass()) {
            return false;
        }

        Kirja kirja = (Kirja) olio;

        if (this.julkaisuvuosi != kirja.getJulkaisuvuosi()) {
            return false;
        }

        if (this.nimi == null || !this.nimi.equals(kirja.getNimi())) {
            return false;
        }
        if (this.nimi.equals(kirja.nimi)) {
            return true;
        }
        return true;
    }
}
