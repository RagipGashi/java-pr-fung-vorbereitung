package tag10_2013_s_ga._fiae;

/**
 *
 * @author RagipGashi
 */
public class Liane extends Gehoelz {
    
    public Liane(String art, int pflanzjahr, float preis) {
        super(art, pflanzjahr, preis);
    }
    
    public String getInfo() {
        return super.getInfo() + " Liane []";
    }
}