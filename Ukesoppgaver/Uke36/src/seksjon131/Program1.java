package seksjon131;


public class Program1 {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 1, 4, 5};
        Tabell.nestePermutasjon(a);
        Tabell.skriv(a);
    }
}

//Oppgave til Avsnitt 1.3.1, 2)
//int[] a = {2, 3, 6, 1, 4, 5}: 2, 3, 6, 1, 5, 4
//int[] b = {2, 3, 6, 1, 5, 4}: 2, 3, 6, 4, 1, 5
//int[] c = {2, 3, 1, 6, 5, 4}: 2, 3, 4, 1, 5, 6
//int[] d = {2, 3, 6, 5, 4, 1}: 2, 4, 1, 3, 5, 6
//int[] e = {2, 6, 5, 4, 3, 1}: 3, 1, 2, 4, 5, 6




