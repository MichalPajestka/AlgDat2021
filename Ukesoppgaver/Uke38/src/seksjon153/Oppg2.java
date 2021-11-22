package seksjon153;

import static seksjon153.Oppg1.sum;

public class Oppg2 {
    public static void main(String[] args) {
        int[] a = Tabell.randPerm(100);       // en permutasjon av tallene fra 1 til 100
        System.out.println(sum(a,a.length));  // Utskrift: 5050
    }

}
