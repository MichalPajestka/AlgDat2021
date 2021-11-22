package seksjon143;

public class Oppgave7 {
    public static void main(String[] args) {
        double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        Double[] b = new Double[d.length];

        // hvert element b lages som en instans av class Double
        for (int i = 0; i < b.length; i++) b[i] = d[i];  // autoboksing

        Tabell.innsettingssortering(b);
        Tabell.skrivln(b);  // se Oppgave 5
    }
}
