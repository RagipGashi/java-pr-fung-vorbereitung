package tag09_2015_s_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public class Artistengruppe extends Kuenstlergruppe{
    private final double pauschalPreis;
    private final String genre;

    public Artistengruppe(double pauschalPreis, String genre, String name) {
        super(name);
        this.pauschalPreis = pauschalPreis;
        this.genre = genre;
    }

    public double getPauschalPreis() {
        return pauschalPreis;
    }
    
    @Override
    public String getArt() {
        return genre;
    }
}
