package app;

public class Film {
    private String cim;
    private String rendezo;
    private int megjelenesiEv;
    private double pont;
    private boolean korhataros;

    public Film(String cim, String rendezo, int megjelenesiEv, double pont, boolean korhataros) {
        this.cim = cim;
        this.rendezo = rendezo;
        this.megjelenesiEv = megjelenesiEv;
        this.pont = pont;
        this.korhataros = korhataros;
    }

    public double getPont() {
        return pont;
    }

    public boolean isKorhataros() {
        return korhataros;
    }
    
    public String getCim() {
        return cim;
    }

    public String getRendezo() {
        return rendezo;
    }

    public int getMegjelenesiEv() {
        return megjelenesiEv;
    }
    
    
}
