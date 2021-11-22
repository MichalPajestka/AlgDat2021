import java.util.Arrays;

public class test {
    public static int gcd(int a, int b)  // Euklids algoritme
    {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void rotasjon(char[] c, int d)    // 3. versjon
    {
        int n = c.length;  if (n < 2) return;         // ingen rotasjon
        if ((d %= n) < 0) d += n;                     // motsatt vei?

        int s = gcd(n, d);                            // største felles divisor

        for (int k = 0; k < s; k++)                   // antall sykler
        {
            char verdi = c[k];                          // hjelpevariabel

            for (int i = k - d, j = k; i != k; i -= d)  // løkke
            {
                if (i < 0) i += n;                        // sjekker fortegnet til i
                c[j] = c[i]; j = i;                       // kopierer og oppdaterer j
            }

            c[k + d] = verdi;                           // legger tilbake verdien
        }
    }

    public static void main(String[] args) {
        char[] a = {'A', 'B'};
        System.out.println(Arrays.toString(a));
        rotasjon(a, 2);
        System.out.println(Arrays.toString(a));
        rotasjon(a, -1);
        System.out.println(Arrays.toString(a));
    }
}
