package tag11_2016_w_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public class Rechnung extends Kunde {

    public Rechnung(Kunde kunde, int kundennummer, String name, String strasse, int plz, String ort) {
        super(kundennummer, name, strasse, plz, ort);
    }

    public double getGesamtBeitrat () {
        return 0.0;
    }  
}
