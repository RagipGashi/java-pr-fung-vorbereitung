package tag07_2018_s_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public class Industrieroboter extends Werkzeug {

    private final int maxAnzWekzeug = 10;
    Werkzeug werkzeugKasten[] = new Werkzeug[10];

    public Industrieroboter() {
        super();
    }

    public boolean werkzeugHizufuegen(int platz, Werkzeug neu) {

        return true;
    }

    public boolean werkzeugEntfernen(int platz, Werkzeug neu) {
        boolean result = false;

        if (platz < werkzeugKasten.length || platz >= 0) {
            werkzeugKasten[platz] = neu;
            System.out.println("Werkzeug kann nicht hinzgefuegt werden!"
                    + " Gibt es kein Platz mehr.");
        } else if (werkzeugKasten[platz] == null) {
            return false;
        }
        return true;
    }
}
