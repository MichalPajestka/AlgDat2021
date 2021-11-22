package seksjon136;


/*
    3. versjon av binærsøk returnerer alltid indeksen til den
    første av dem hvis søkeverdien det søkes forekommer flere ganger.
    Sjekk at det stemmer for tallene i Oppgave 3.
*/
public class Program2 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 4, 5, 7, 7, 7, 7, 8, 9, 10, 10, 12, 15, 15, 15};
                //{0, 1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10,11, 12, 13, 14, 15, 16}
        System.out.println(Tabell.binærsøk3(a, 15));
    }
}

//i) 2
//ii) 5
//iii) 11
//iv) 14