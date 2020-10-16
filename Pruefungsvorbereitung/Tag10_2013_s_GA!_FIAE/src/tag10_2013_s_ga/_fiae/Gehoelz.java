package tag10_2013_s_ga._fiae;

/**
 *
 * @author RagipGashi
 */
public abstract class Gehoelz {
    private String art;
    private int pflanzjahr;
    private float preis;
    
    public Gehoelz(String art, int pflanzjahr, float preis) {
        this.art = art;
        this.pflanzjahr = pflanzjahr;
        this.preis = preis;
    }
    
    public void setArt(String art) { this.art = art; }
    
    public String getArt() { return art; }
    
    public void setPflanzjahr(int pflanzjahr) { this.pflanzjahr = pflanzjahr; }
    
    public int getPflanzjahr() { return pflanzjahr; }
    
    public void setPreis(float preis) { this.preis = preis; }
    
    public float getPreis() { return preis; }
    
    public String getInfo() {
        return "Gehoelz [art=" + art + ", pflanzjahr=" + 
                pflanzjahr + ", preis=" + preis + "]";
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || (this.getClass() != obj.getClass())) return false;
        Gehoelz g = (Gehoelz) obj;
        return this.art.equals(g.getArt())
                && this.getPflanzjahr() == g.getPflanzjahr();
    }
}

