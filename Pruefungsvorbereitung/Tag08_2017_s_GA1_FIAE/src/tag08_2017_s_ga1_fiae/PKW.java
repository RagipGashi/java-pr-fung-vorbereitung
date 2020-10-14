package tag08_2017_s_ga1_fiae;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RagipGashi
 */
public class PKW {

    private int kategorie = 0;
    private String modell = "";
    private String farbe = "";
    private int erstzulassungsJahr = 0;
    private int kmStand = 0;
    String test = "Test die PKW Klasse.";
    private List<Buchung> ausleihDaten = new ArrayList<>();

    public PKW(int kategorie, String modell, String farbe, int erstzulassungsJahr,
            int kmStand) {
        this.kategorie = kategorie;
        this.modell = modell;
        this.farbe = farbe;
        this.erstzulassungsJahr = erstzulassungsJahr;
        this.kmStand = kmStand;
    }

    public int getKategorie() {
        return kategorie;
    }

    public String getModell() {
        return modell;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getErstzulassungsJahr() {
        return erstzulassungsJahr;
    }

    public int getKmStand() {
        return kmStand;
    }
    
    public boolean mieten(String ausleihDatum, String uhrzeit, String fahrer,
            int kmStand) {
        for (Buchung b : ausleihDaten) {
            if (b.getAusleihDatum().equals(ausleihDatum) && b.getUhrzeit().equals(uhrzeit)) {
                // kein Buchung möglich
                return false;
            }
        }
        ausleihDaten.add(new Buchung(ausleihDatum, uhrzeit, fahrer));
        this.kmStand = kmStand;
        return true;
    }

}
