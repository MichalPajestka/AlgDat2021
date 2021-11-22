package seksjon153;

public class Oppg1 {
    public static int sum(int[] a, int n)   // summen av de n første
    {
        if (n == 1) return a[0];       // summen er verdien selv
        return sum(a,n-1) + a[n-1];    // summen av de n-1 første + a[n-1]
    }
}
