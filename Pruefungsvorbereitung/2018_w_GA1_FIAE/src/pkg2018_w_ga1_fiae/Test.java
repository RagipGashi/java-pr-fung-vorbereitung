package pkg2018_w_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
public class Test {

    public static void main(String[] args) {
        //        char z1 = 'S';
//        char z2 = 'M';
//        int zWert = ((z1 + z2 - (2 * 'A')) % 26) + 'A';
//        System.out.println("zWert: " + zWert );
//        char erg = (char)zWert;
//        System.out.println("erg=" + erg);
        
        SymmetrischeCodierverfahren sv = new Vigenere();
        
//        sv.setKlarText("DERADLERISTGELANDET");
//        sv.setPrivateKey("PRUEFUNG");
        
        sv.setKlarText("DIESISTEINEBOTSCHAFT");
        sv.setPrivateKey("GEHEIM");
        
        System.out.println("Klartext:      " + sv.getKlarText());
        System.out.println("Verschlüsselt: " + sv.codieren());
    }

}



