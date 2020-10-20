package tag10_groesstegemeinsamnenner;

/**
 * Berechne der größte gemeinsame Teiler
 * 
 * Example inptu:   m = 10; 
 *                  n = 5; 
 * Example output:  10
 */
import java.util.Scanner;

/**
 *
 * @author RagipGashi
 */
public class Tag10_GroessteGemeinsamTeiler {

    public static void main(String[] args) {
        
        int m, n, r;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bitte geben den Wert von m: ");
        m = sc.nextInt();
        
        System.out.println("Bitte geben den Wert von n: ");
        n = sc.nextInt();
       
        r = m % n;
        while (r > 0) {            
            m = n;
            n = r;
            r = m % n;
        }
        System.out.println("Der grösste gemeinsam Teiler ist: " + m);
    }
}
