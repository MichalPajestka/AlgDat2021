package seksjon151;

public class Oppg9 {
    public static int maks(int[] a, int v, int h)
    {
        if (v == h) return v;
        int m = (v + h)/2;  // midten
        int mv = maks(a,v,m);
        int mh = maks(a,m+1,h);

        return a[mv] >= a[mh] ? mv : mh;
    }

    public static int maks(int[] a)
    {
        return maks(a,0,a.length-1);
    }
}
