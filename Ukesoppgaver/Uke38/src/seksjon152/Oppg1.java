package seksjon152;

public class Oppg1 {

    public static int tverrsum(int n)
    {
        System.out.println("tverrsum(" + n + ") starter!");
        int sum = (n < 10) ? n : tverrsum(n / 10) + (n % 10);
        System.out.println("tverrsum(" + n + ") er ferdig!");
        return sum;
    }

    public static void main(String... args)
    {
        System.out.println("main() starter!");
        int sum = tverrsum(72951);
        System.out.println("main() er ferdig!");
    }
}
