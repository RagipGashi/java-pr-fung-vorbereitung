package s2017;

/**
 *
 * @author RagipGashi
 */
public class Test_IBAN {

    public static void main(String[] args) {
        int pruefZiffer = berechnePruefziffer(21050170, 12345678);
        System.out.println("21050170 - " + pruefZiffer);

//        float roundedFloat = printRounded((float) 23.152);
//        System.out.println("Print method: " + roundedFloat);
    }

    static int berechnePruefziffer(long blz, long ktNr) {
        while (blz >= 97) {
            blz -= 97;
        }
        ktNr = ktNr * 1000000;
        ktNr = ktNr + 131400;
        while (ktNr >= 88529281) {
            ktNr -= 88529281;
        }
        while (ktNr >= 97) {
            ktNr -= 97;
        }
        long pz = blz * 62 + ktNr;
        while (pz >= 97) {
            pz -= 97;
        }
        pz = 98 - pz;
        return (int) pz;
    }

    /**
     * Winter 2013/14 Aufgabe 3.2
     *
     * @param a, a parameter which should be checked and return a rounded value
     * @return, return the rounded value of the parameter a
     */
    static float printRounded(float a) {
        float roundedFloat = (float) (Math.round(a * 10.0) / 10.0);
        return roundedFloat;
    }
}
