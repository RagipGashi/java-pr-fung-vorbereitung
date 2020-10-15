package tag09_2015_s_ga1_fiae;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RagipGashi
 */
public class KuenstlerListe {

    private List<Kuenstlergruppe> gruppen = new ArrayList<>();

    public void hinzufuegen(Kuenstlergruppe gruppe) {
        gruppen.add(gruppe);
    }

    public boolean entfernen(Kuenstlergruppe gruppe) {
        return gruppen.remove(gruppe);
    }

    public Kuenstlergruppe get(int i) {

        if (i < 0 || i >= gruppen.size()) {

            return null;
        } else {
            return gruppen.get(i);
        }
    }
}
