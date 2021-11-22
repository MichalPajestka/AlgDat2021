package seksjon131;

public class Program2 {
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 9, 7, 10, 8, 6, 5, 2};

        for (int i = 0; i < 10; ++i){
            Tabell.nestePermutasjon(a);
            Tabell.skrivln(a);
        }
    }
}

//Oppgave til avsnitt 1.3.1, 3):
//3 1 4 9 8 2 5 6 7 10
//3 1 4 9 8 2 5 6 10 7
//3 1 4 9 8 2 5 7 6 10
//3 1 4 9 8 2 5 7 10 6
//3 1 4 9 8 2 5 10 6 7
//3 1 4 9 8 2 5 10 7 6
//3 1 4 9 8 2 6 5 7 10
//3 1 4 9 8 2 6 5 10 7
//3 1 4 9 8 2 6 7 5 10
//3 1 4 9 8 2 6 7 10 5