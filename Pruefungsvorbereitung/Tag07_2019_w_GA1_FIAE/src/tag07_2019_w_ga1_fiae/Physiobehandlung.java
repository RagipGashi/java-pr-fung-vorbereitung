package tag07_2019_w_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public class Physiobehandlung extends Behandlung{
    public Physiobehandlung() {
        super();
    }

    public Physiobehandlung(String kvNummer, String beschreibung, double kostensatz) {
        super(kvNummer, beschreibung, kostensatz);
    }

    @Override
    public double getKosten() {
      
        return 1.5 * getKostensatz();
    }
}
