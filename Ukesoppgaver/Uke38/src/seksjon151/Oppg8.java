package seksjon151;

public class Oppg8 {
    public static int sum(int n, int k)
    {
        if (n == k) return n;
        int m = (n + k)/2;
        return sum(n,m) + sum(m+1,k);
    }
}
