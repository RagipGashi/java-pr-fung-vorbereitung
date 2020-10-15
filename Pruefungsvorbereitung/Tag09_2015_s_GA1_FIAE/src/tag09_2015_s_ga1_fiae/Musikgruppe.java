package tag09_2015_s_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public class Musikgruppe extends Kuenstlergruppe {
    private static double aktGemaPauschale;
    private final double preisProStunde;
    private final String musikStil;

    public Musikgruppe(double preisProStunde, String musikStil, String name) {
        super(name);
        this.preisProStunde = preisProStunde;
        this.musikStil = musikStil;
    }

    public static double getAktGemaPauschale() {
        return aktGemaPauschale;
    }

    public double getPreisProStunde() {
        return preisProStunde;
    }

    @Override
    public String getArt() {
        return "Musikgruppe " + musikStil;
    }
}
