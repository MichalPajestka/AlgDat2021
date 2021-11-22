package seksjon136;


/*
    Gitt at søkeverdien har duplikater. Bruker vi 1. eller
    2. versjon av binærsøk, vet vi ikke hvem av dem som den
    returnerte indeksen hører til. Gitt verdiene: 1, 3, 4, 4, 5, 7, 7, 7, 7,
    8, 9, 10, 10, 12, 15, 15, 15. Bruk 1. versjon.
    Søk etter i) 4, ii) 7, iii) 10 og iv) 15.
    Hvilken av verdiene hører den returnerte indeksen til?
    Obs. Det er det samme om det er 1. eller 2. versjon. De gir alltid de samme returverdi.
*/
public class Program1 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 4, 5, 7, 7, 7, 7, 8, 9, 10, 10, 12, 15, 15, 15};
                //{0, 1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10,11, 12, 13, 14, 15, 16}
        System.out.println(Tabell.binærsøk(a,7));
    }
}

//i) 3
//ii) 8
//iii) 12
//iv) 14