package tag08_2017_s_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public class Buchung {
    private String ausleihDatum = "";
    private String uhrzeit = "";
    private String fahrer = "";

    public Buchung(String ausleihDatum, String uhrzeit, String fahrer) {
        this.ausleihDatum = ausleihDatum;
        this.uhrzeit = uhrzeit;
        this.fahrer = fahrer;
    }

    public String getAusleihDatum() {
        return ausleihDatum;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public String getFahrer() {
        return fahrer;
    }
    
    
}
