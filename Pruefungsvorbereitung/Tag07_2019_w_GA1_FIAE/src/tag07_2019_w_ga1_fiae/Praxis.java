package tag07_2019_w_ga1_fiae;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RagipGashi
 */
public class Praxis {
    // Declare a List behandlungen 
    private List<Behandlung> behandlungen = new ArrayList<>();
    private List<Patient> patienten = new ArrayList<>();
    
    public List<Patient> getPatient(String name) {
        ArrayList<Patient> patientenliste = new ArrayList<>();
        for (int i = 0; i < patienten.size(); i++) {
            Patient p = patienten.get(i);
            if (p.getName().equals(name)) {
                patientenliste.add(p);
            }
        }
        return patientenliste;
    }
    
    public List<Behandlung> getBehandlungen(String kvNummer) {
        ArrayList<Behandlung> behandlungsList = new ArrayList<>();
        for (Behandlung b : behandlungen) {
            if (b.getKvNummer().equals(kvNummer)) {
                behandlungsList.add(b);
            }
        }
        return behandlungsList;
    }
    
    public int anzBehandlungen(String kvNummer) {
        return getBehandlungen(kvNummer).size();
    }
    
    public String zeigePatienten(int anzBehandlungen) {
        String zeigePatientenListe = "";
        for (Patient patient : patienten) {
            if (anzBehandlungen(patient.getKvNummer()) >= anzBehandlungen) {
                zeigePatientenListe += patient.getName() + "; ";
            }
        }
        return zeigePatientenListe;
    }
    
    public void addBehandlung(Behandlung b) {
        behandlungen.add(b);
    }
    
    public double ermittleKoste() {
        double result = 0;
        for (int i = 0; i < behandlungen.size(); i++) {
            result += behandlungen.get(i).getKosten();
        }
        return result;
    }
}
