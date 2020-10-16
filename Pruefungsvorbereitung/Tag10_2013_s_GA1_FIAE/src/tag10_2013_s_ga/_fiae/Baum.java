package tag10_2013_s_ga._fiae;

/**
 *
 * @author RagipGashi
 */
public class Baum extends Gehoelz {
    private int maxHoehe;
    
    Baum (String art, int pflanzjahr, float preis, int maxHoehe) {
        super(art,  pflanzjahr,  preis);
        this.maxHoehe = maxHoehe;
    }
    public void setMaxHoehe(int maxHoehe) { this.maxHoehe = maxHoehe; }
    
    public int getMaxHoehe() { return maxHoehe; }
    
    public String getInfo() {
        return super.getInfo() + " Baum [maxHoehe=" + maxHoehe + "]";
    }
}
