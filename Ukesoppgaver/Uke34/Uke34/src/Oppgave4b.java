public class Oppgave4b {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(maks(a));

    }

    public static int maks(int[] a)
    {
        int m = 0;               //indeks til største verdi             // 1
        int maksverdi = a[0];    //største verdi                        // 2

        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)        // 1 + n + n - 1 + 2(n-1)
        {
            maksverdi = a[i];    // største verdi oppdateres            // 3x
            m = i;               //indeks til største verdi oppdateres  // 1
        }
        return m;
    }

}

// ii) 1 + 2 + 1 + n + n -1 + 2(n - 1) + 3x + 1 = 4n + 1 + 3x
//     n = 10, x = 9, sum = 68


