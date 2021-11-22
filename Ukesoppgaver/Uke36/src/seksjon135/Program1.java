package seksjon135;


/*
2.	Sjekk at metoden lineærsøk gir korrekt returverdi hvis det
    søkes etter en verdi som er mindre enn den minste i tabellen.
    Hva skjer hvis tabellen er tom, dvs. a.length = 0? La a være
    tabellen i Figur 1.3.5 a). Hva blir returverdiene fra lineærsøk
    hvis vi søker etter 2, 15, 16, 40 og 41?
*/

public class Program1 {
    public static void main(String[] args) {
        int[] a = {3,8,10,12,14,16,21,24,27,30,32,33,34,37,40};
        System.out.println(Tabell.lineærsøk(a,41));
    }
}

//Metoden returnerer -1 dersom det søkes etter 1, som er mindre enn den
//minste verdien i tabellen

//Dersom tabellen er tom, blir returnverdien også -1

//2: -1
//15: -16
//16: 5
//40: 14
//41: -16
