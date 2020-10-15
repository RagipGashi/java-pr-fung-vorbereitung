package tag09_2014_s_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public abstract class Produkt {
    public int anzahl = 0;
	public int ausschuss = 0;
	protected String zustand = "";
	protected int pruductNr = 0;
	protected String productTyp = "";

    public String getZustand() {
        return zustand;
    }

    public void setZustand(String zustand) {
        this.zustand = zustand;
    }

    public int getPruductID() {
        return pruductNr;
    }

    public void setPruductID(int pruductID) {
        this.pruductNr = pruductID;
    }

    public String getProductTyp() {
        return productTyp;
    }

    public void setProductTyp(String productTyp) {
        this.productTyp = productTyp;
    }
        
    public abstract int pruefen();
}
