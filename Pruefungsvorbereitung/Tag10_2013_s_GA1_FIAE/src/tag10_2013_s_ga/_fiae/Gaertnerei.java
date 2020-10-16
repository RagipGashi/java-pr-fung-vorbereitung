package tag10_2013_s_ga._fiae;

import java.util.ArrayList;

/**
 *
 * @author RagipGashi
 */

public class Gaertnerei {
    private ArrayList<Gehoelz> pflanzen = new ArrayList<>();
    
    public Gaertnerei() { }
    
    public void einkaufen(Gehoelz neuePflanze) {
        pflanzen.add(neuePflanze);
    }
    
    public void listPflanzen() {
        for (Gehoelz g : pflanzen)
            System.out.println(g.getInfo());
    }
    
    public ArrayList<Gehoelz> getWoodByLimit(float limit) {
        ArrayList<Gehoelz> billig = new ArrayList<>();
        for (Gehoelz p : pflanzen) {
            if (p.getPreis() < limit) {
                billig.add(p);
            }
        }
        return billig;
    }
    
	// Aufgabenstellung: return null, wenn die gewünschte Pflanze nicht gefunden wird.
	//                   Es wird aber keine Angabe gemacht welcher Wert zurück gegeben
	//                   werden soll, wenn die gewünschte Pflanze gefunden wird.
	//                   Praktisch ist: das gefundene Objekt als return-Wert zu übergeben

    public Gehoelz verkaufen(String art, int pflanzjahr) {
        for (Gehoelz p : pflanzen) {
            if (p.getArt().equals(art) && p.getPflanzjahr() == pflanzjahr) {
                pflanzen.remove(p);
                return p;
            }
        }
        return null;
    }
//
//  !!!! der folgende Code ist nicht Bestandteil der Prüfung !!!!
//
    public static void main(String[] args) {
        Gaertnerei g = new Gaertnerei();
        g.einkaufen(new Baum("Eiche", 2017, 48, 5));
        g.einkaufen(new Strauch("Rhododendron", 2018, 25, true));
        g.einkaufen(new Strauch("Hortensie", 2018, 15, false));
        g.einkaufen(new Strauch("Hortensie", 2019, 13, false));
        g.einkaufen(new Baum("Eiche", 2016, 59, 6));
        g.einkaufen(new Liane("Knöterich", 2019, 10));
        
        System.out.println("---------- aktueller Bestand -------");
        g.listPflanzen();
        
        Gehoelz verkauft = g.verkaufen("Hortensie", 2018);
        System.out.println("dein Wunsch: " + verkauft.getInfo());
        verkauft = g.verkaufen("Hortensie", 2018);
        
        System.out.println( verkauft == null ? "leider nicht verfügbar" : 
                "verkauft: " + verkauft.getInfo());

        System.out.println("---------- nach dem Verkauf --------");
        g.listPflanzen();
        System.out.println("---------- billiger als 20 ---------");
        for (Gehoelz b : g.getWoodByLimit(20)) 
                System.out.println(b.getInfo());

    }
}