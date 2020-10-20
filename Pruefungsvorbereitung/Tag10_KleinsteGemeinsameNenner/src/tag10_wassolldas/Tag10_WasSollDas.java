package tag10_wassolldas;

/**
 * Find the smallest common denominator (der kleinste gemeinsame Nenner)
 * 
 * Example inptu:   m = 10; 
 *                  n = 5; 
 * Example output:  5
 */
import java.util.Scanner;

/**
 *
 * @author RagipGashi
 */
public class Tag10_WasSollDas {

    public static void main(String[] args) {

        int m, n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of m: ");
        m = sc.nextInt();
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();

        while (m != n) {
            if (m > n) {
                m -= n;
            } else {
                n -= m;
            }
        }
        System.out.println("The smallest denominator is: " + m);
    }
}
