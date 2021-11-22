package seksjon151;

public class Oppg10 {
    public static int fakultet(int n)
    {
        return n < 2 ? 1 : fakultet(n-1)*n;
    }
}
