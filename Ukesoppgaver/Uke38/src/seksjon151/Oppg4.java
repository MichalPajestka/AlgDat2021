package seksjon151;

public class Oppg4 {
    public static int tverrsum(int n) {
        /*if (n < 10) return n;                        // kun ett siffer
        else return tverrsum(n / 10) + (n % 10);     // metoden kalles*/

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static int sifferrot(int n)
    {
        while (n >= 10) n = tverrsum(n);
        return n;
    }
}
