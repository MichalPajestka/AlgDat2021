package seksjon151;

public class Oppg1 {
    public static int a(int n)           // n et ikke-negativt tall
    {
        /*
        if (n == 0) return 1;              // a0 = 1
        else if (n == 1) return 2;         // a1 = 2
        else return 2*a(n-1) + 3*a(n-2);   // to rekursive kall
        */

        if (n < 0) throw new IllegalArgumentException("n er negativ!");

        int x = 0, y = 1, z = 1;

        for (int i = 0; i < n; i++)
        {
            z = 2*y + 3*x; x = y; y = z;
        }
        return z;
    }
}
