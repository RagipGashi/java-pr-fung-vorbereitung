package tag07_2019_w_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public class Patient {
    private String kvNummer;
    private String name;
    private String vorname;

    public Patient(String kvNummer, String name, String vorname) {
        this.kvNummer = kvNummer;
        this.name = name;
        this.vorname = vorname;
    }

    public Patient() {
        kvNummer = "";
        name = "";
        vorname = "";
    }

    public String getKvNummer() {
        return kvNummer;
    }

    public void setKvNummer(String kvNummer) {
        this.kvNummer = kvNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    
    
}
