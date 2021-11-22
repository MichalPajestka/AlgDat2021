package seksjon151;

public class Oppg7 {
    public static int kvadratsum(int n)
    {
        if (n == 1) return 1;
        else return kvadratsum(n-1) + n*n;
    }
}
