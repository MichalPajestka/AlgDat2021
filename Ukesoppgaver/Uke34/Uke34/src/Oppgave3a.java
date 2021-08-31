import java.util.Arrays;

public class Oppgave3a {
    public static void main(String[] args) {

        int[] a = {20, 8};

        System.out.println(Arrays.toString(minmaks(a)));

    }

    public static int[] minmaks(int[] a){
        int m1 = 0, minverdi = a[0];
        int m2 = 0, maksverdi = a[0];

        int verdi = 0;

        for (int i=1; i<a.length; ++i){

            verdi = a[i];

            if (verdi > maksverdi) {                    // n-1
                maksverdi = verdi;
                m2 = i;
            }
            else if (verdi < minverdi) {                // n-1
                minverdi = verdi;
                m1 = i;
            }
        }
       return new int[]{m1, m2}; // sammenligningen av verdiene blir utført 2n-2 ganger
    }
}
