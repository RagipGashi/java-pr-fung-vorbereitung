package tag07_2017_w_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public abstract class Bauteil {
    
    protected int lang;
    protected int breit;
    protected int stark;
    private int laengeGeleimteKante;
    private boolean kaltenGeleimt;
    
    public Bauteil() {
        this.lang = 0;
        this.breit = 0;
        this.stark = 0;
        this.laengeGeleimteKante = 0;
        this.kaltenGeleimt = false;
    }

    public Bauteil(int lang, int breit, int stark, int laengeGeleimteKante, boolean kaltenGeleimt) {
        this.lang = lang;
        this.breit = breit;
        this.stark = stark;
        this.laengeGeleimteKante = laengeGeleimteKante;
        this.kaltenGeleimt = kaltenGeleimt;
    }
    
    public abstract int fetigen();
    
    public abstract boolean kontrolle();

    public int getLaengeGeleimteKante() {
        return laengeGeleimteKante;
    }

    public void setLaengeGeleimteKante(int laengeGeleimteKante) {
        this.laengeGeleimteKante = laengeGeleimteKante;
    }

    public boolean isKaltenGeleimt() {
        return kaltenGeleimt;
    }

    public void setKaltenGeleimt(boolean kaltenGeleimt) {
        this.kaltenGeleimt = kaltenGeleimt;
    }
    
    
}
