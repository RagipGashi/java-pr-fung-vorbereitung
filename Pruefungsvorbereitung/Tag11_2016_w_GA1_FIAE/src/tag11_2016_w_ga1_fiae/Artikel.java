package tag11_2016_w_ga1_fiae;

/**
 *
 * @author ragipgashi
 */
public abstract class Artikel extends Rechnung{
    
    private int nummer;
    private String bezeichnung;
    protected double preis;

    public Artikel(Kunde kunde, int kundennummer, String name, String strasse, int plz, String ort)
    {
        super(kunde, kundennummer, name, strasse, plz, ort);
    }

    


    
    public int getNummer()
    {
        return nummer;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public double getPreis()
    {
        return preis;
    }
}
