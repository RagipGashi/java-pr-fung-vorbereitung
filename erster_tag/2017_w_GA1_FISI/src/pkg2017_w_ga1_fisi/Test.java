package pkg2017_w_ga1_fisi;

import java.util.Arrays;

/**
 *
 * @author RagipGashi
 */
public class Test {

    public static void main(String[] args) {

        String stringIP = "2001:0db8:0000:08d3:0000:8a2e:0070:7344";
        System.out.println("Original IP: ");
        System.out.println(stringIP);
        char[] newIP;
        newIP = stringIP.toCharArray();
        for (int i = 0; i < stringIP.length(); i += 5) {
            int j = 0;
            while (j < 3 && newIP[i + j] == '0') {
                newIP[i + j] = 'X';
            }
        }
        System.out.println("Converted IP: ");
        System.out.println(newIP);
    }
}
