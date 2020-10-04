package ErsterTag;


import java.util.Scanner;

/**
 *
 * @author RagipGashi
 */
public class MultiplizierenDurchAddieren {
    
    public static void main(String[] args) {
       int summe = 0;
		int n = 1;
		int i = 1;
		int grenzWert;

		System.out.println("Berechnung der Summe 1+2+3+4+ ... bis zum Grenzwert");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Grenzwet: ");
		grenzWert = sc.nextInt();
		
		
		while(summe <= grenzWert)
		{  
			
			summe = summe + n++;
			
			i = n-1;
		}
		System.out.printf("Nach %d Gliedern ist %d erreicht. Die summe ist %d%n", i, grenzWert, summe);
    }
    
    
}
