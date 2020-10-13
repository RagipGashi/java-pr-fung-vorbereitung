package tag07_2017_w_ga1_fiae;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RagipGashi
 */
public class Regalschrank {

    private int anzahlBauteile;
    private int anzahlFachboeden;
    private boolean fertig;

    List<Bauteil> teileListe = new ArrayList<>();

    public Regalschrank() {
        this.anzahlBauteile = 0;
        this.anzahlFachboeden = 0;
        this.fertig = false;
    }

    public Regalschrank(int anzahlBauteile, int anzahlFachboeden) {
        this.anzahlBauteile = anzahlBauteile;
        this.anzahlFachboeden = anzahlFachboeden;
        this.fertig = false;
    }

    public boolean gesamtKontrolle() {
        boolean teilExist = true;
        for (Bauteil teil : teileListe) {
            if (teil.kontrolle()) {
                teilExist = false;
            }
        }
        return teilExist;
    }

    public boolean addBauteil(Bauteil neuesBautiel) {
        boolean teilExist = false;
        if (anzahlBauteile < this.anzahlBauteile) {
            teileListe.add(neuesBautiel);
            teilExist = true;
        }
        return teilExist;
    }
}
