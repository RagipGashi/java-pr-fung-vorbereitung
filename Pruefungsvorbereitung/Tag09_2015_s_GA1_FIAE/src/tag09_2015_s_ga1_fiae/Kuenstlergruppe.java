package tag09_2015_s_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public abstract class Kuenstlergruppe {
    private final String name;
    
    public Kuenstlergruppe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract String getArt();
}
