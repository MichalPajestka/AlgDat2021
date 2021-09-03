package seksjon121;


// Lag to min-metoder (metoder som finner posisjonen til den minste verdien)
// tilsvarende de to maks-metodene i Programkode 1.2.1 b) og 1.2.1 c).
// Legg dem i samleklassen Tabell. Se Avsnitt 1.2.2.
public class Oppgavee1 {
    public static void main(String[] args) {
        int[] a = {2, 5, 10, 1, 6, 8, 20, 9};

        System.out.println(min(a));
        System.out.println(min(a));
    }

    public static int min(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til minste verdi i a[fra:til>
        int minverdi = a[fra];   // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] < minverdi)
            {
                m = i;                // indeks til minste verdi oppdateres
                minverdi = a[m];     // minste verdi oppdateres
            }
        }

        return m;
    }
    public static int min(int[] a){
        return min(a,0,a.length);
    }
}
