package tag07_2019_w_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public abstract class Behandlung {
    
    private String kvNummer;
    private String beschreibung;
    private double kostensatz;

    public Behandlung() {
        kvNummer = "";
        beschreibung = "";
        kostensatz = 0.0;
    }

    public Behandlung(String kvNummer, String beschreibung, double kostensatz) {
        this.kvNummer = kvNummer;
        this.beschreibung = beschreibung;
        this.kostensatz = kostensatz;
    }

    public String getKvNummer() {
        return kvNummer;
    }

    public void setKvNummer(String kvNummer) {
        this.kvNummer = kvNummer;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getKostensatz() {
        return kostensatz;
    }

    public void setKostensatz(double kostensatz) {
        this.kostensatz = kostensatz;
    }  
    
    public abstract double getKosten();
}
