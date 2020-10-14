package tag08_2016_s_ga1_fiae;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RagipGashi
 */
public class Leser {

    private int leserNr;
    private String name;
    private String vorname;
    private ArrayList<Medium> ausleihliste;
    private ArrayList<Medium> vormerkliste;

    public Leser(int leserNr, String name, String vorname, ArrayList<Medium> ausleihliste,
            ArrayList<Medium> vormerkliste) {
        this.leserNr = leserNr;
        this.name = name;
        this.vorname = vorname;
        ausleihliste = new ArrayList<>();
        vormerkliste = new ArrayList<>();
    }

    public ArrayList<Medium> getAusleihliste() {
        return ausleihliste;
    }

    public ArrayList<Medium> getVormerkliste() {
        return vormerkliste;
    }

    public boolean hatAusgeliehen(int bibNr) {
        for (int i = 0; i < ausleihliste.size(); i++) {
            if (ausleihliste.get(i).getBibNr() == bibNr) {
                return true;
            }
        }
        return false;
    }
}
