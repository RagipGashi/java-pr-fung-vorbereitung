package pkg2018_w_ga1_fiae;

/**
 *
 * @author RagipGashi
 */
// Declare class Vignere which should extend SystematischeCodierung and implement
// its abstract method codieren()
class Vigenere extends SymmetrischeCodierverfahren {

    // Declare abstract method codieren() (Override it)
    public Vigenere() {
        super();
    }
    
    @Override
    public String codieren() {
        char[] text = klarText.toCharArray();
        char[] key = privateKey.toCharArray();
        char[] coded = new char[klarText.length()];
        int k = 0;
        int kMax = privateKey.length();
        for (int t = 0; t < klarText.length(); t++, k++) {
           if (k >= kMax) k = 0; // repeat privateKey from 1st letter
           // System.out.print(" - " + k); 
           coded[t] = (char)(((text[t] - 'A' + key[k] - 'A') % 26) + 'A');
        }
        return new String(coded);
    }
}