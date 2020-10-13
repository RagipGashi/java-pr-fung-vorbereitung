package pkg2018_w_ga1_fiae;

/**
 *
 * @author RagipGashi
 */

// Abstract class 
public abstract class SymmetrischeCodierverfahren {

    protected String klarText;
    protected String privateKey;

    // Declaring the class constructor
    public SymmetrischeCodierverfahren() {}

    // Addint setter and getter 
    public void setPrivateKey(String key) {
        this.privateKey = key;
    }

    public String getKlarText() {
        return klarText;
    }

    public void setKlarText(String text) {
        this.klarText = text;
    }

    // Declare abstract method
    public abstract String codieren();
}

