package seksjon146;

import java.util.Arrays;

public class Oppg5 {
    public static void main(String[] args) {
        String[] s = {"21","18","8","13","20","6","16","25","3","10"};
        Tabell.innsettingssortering(s, (x,y) -> {
            int k = x.length() - y.length();
            return k != 0 ? k : x.compareTo(y);
        });

        System.out.println(Arrays.toString(s));
        // Utskrift: [Per, Lars, Kari, Bodil, Berit, Anders]

    }
}
