package tag07_2019_w_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public class TestClass {

    public static void main(String[] args) {
  
        Praxis praxis = new Praxis();
        
        praxis.addBehandlung(new Physiobehandlung("A12345", "Chirogymnastik", 12.87));
        praxis.addBehandlung(new Physiobehandlung("A12345", "Wärmeanwendung", 4.35));
        praxis.addBehandlung(new Standardbehandlung("A12345", "Arthrose", 45.12));
        praxis.addBehandlung(new Standardbehandlung("A12345", "Ultraschall", 26.80));
        
        System.out.println("Gesamtkosten: " + praxis.ermittleKoste());
    }
    
}
