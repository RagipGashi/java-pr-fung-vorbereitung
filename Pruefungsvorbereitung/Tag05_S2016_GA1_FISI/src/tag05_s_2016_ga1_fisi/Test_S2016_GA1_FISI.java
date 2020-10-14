package s2016_ga1_fisi;

/**
 *
 * @author RagipGashi
 */
public class Test_S2016_GA1_FISI {

    public static void main(String[] args) {
        String[] logs = new String[10];
        logs[0] = "Jan 09 2016|09:15:17|30201|1|SL02|650";
        logs[1] = "Jan 09 2016|09:15:18|43097|1|SL01|945";
        logs[2] = "Jan 09 2016|09:15:19|28774|2|SB03|2050";
        logs[3] = "Jan 09 2016|09:16:28|41028|1|SL02|650";
        logs[4] = "Jan 09 2016|09:16:34|33140|1|SB03|1389";
        logs[5] = "Jan 09 2016|09:17:11|32584|2|SL01|945";
        logs[6] = "Jan 09 2016|09:17:36|37062|1|SL02|650";
        logs[7] = "Jan 09 2016|09:18:16|30201|1|SB03|1389";
        logs[8] = "Jan 09 2016|09:18:18|43097|1|SL01|945";
        logs[9] = "Jan 09 2016|09:19:19|28774|2|SL02|650";

        System.out.println("30201 Liftlänge: " + skipassCalc("30201", logs));
    }

    static int skipassCalc(String passnr, String[] datei) {
        int liftmeter = 0;
        for (int i = 0; i < datei.length; i++) {
            String[] txt = datei[i].split("[|]");
            if (txt[2].equals(passnr)) {
                liftmeter+= Integer.parseInt(txt[5]);
            }
        }
        return liftmeter;
    }
}
