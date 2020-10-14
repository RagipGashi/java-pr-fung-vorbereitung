package tag08_2016_s_ga1_fiae;

import java.util.ArrayList;

/**
 *
 * @author RagipGashi
 */
public class Bibliothek {
    private ArrayList<Leser> leserliste = new ArrayList<>();
    private ArrayList<Medium> meidienliste = new ArrayList<>();
    
    public int ermittleVormerkungen(int bibNr) {
        int anzahl = 0; 
        for (int i = 0; i < leserliste.size(); i++) {
            Leser leser = leserliste.get(i);
            ArrayList<Medium> vorgemerkt = leser.getVormerkliste();
            for (int j = 0; j < vorgemerkt.size(); j++) {
               Medium medium = vorgemerkt.get(j);
               if (medium.getBibNr() == bibNr) {
                   anzahl++;
               }
        }
    }
        return anzahl++;
}
}