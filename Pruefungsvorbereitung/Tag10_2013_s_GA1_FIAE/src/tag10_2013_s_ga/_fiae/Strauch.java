package tag10_2013_s_ga._fiae;

/**
 *
 * @author RagipGashi
 */
public class Strauch extends Gehoelz {
    private boolean istGiftig;
    
	public Strauch(String art, int pflanzjahr, float preis, boolean istGiftig) {
		super(art, pflanzjahr, preis);
		this.istGiftig = istGiftig;
    }
    
    public void setIstGiftig(boolean istGiftig) { this.istGiftig = istGiftig; }
    
    public boolean getIstGifttig() { return istGiftig; }
    
    public String getInfo() {
        return super.getInfo() + " Strauch [istGiftig=" + istGiftig +"]";
    }
}
