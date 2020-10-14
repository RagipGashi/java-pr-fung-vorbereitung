
package tag08_2017_s_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public class AutovermittungTest {

    public static void main(String[] args) {
        PKW car1 = new PKW(1, "Ford", "weiß", 2017, 24500);
        System.out.println("TEST " + car1.test);
        System.out.println((car1.mieten("28.02.2017", "10:30", "M. Müller", 20))?"ok":"geht nicht");
        System.out.println((car1.mieten("30.06.2017", "12:10", "B. Dreier", 1840))?"ok":"geht nicht");
        System.out.println((car1.mieten("15.07.2017", "09:00", "R. Reitmeister", 2530))?"ok":"geht nicht");
        System.out.println((car1.mieten("18.09.2017", "18:00", "W. Fröhlich", 3410))?"ok":"geht nicht");
        
        // nur bei exakt gleichem Datum UND gleicher Uhrzeit ist die Buchung nicht möglich !!!
        // das würde in der Realität so nicht gelöst !
        System.out.println((car1.mieten("15.07.2017", "09:00", "K. Neumann", 4444))?"ok":"geht nicht");
    }
    
}
