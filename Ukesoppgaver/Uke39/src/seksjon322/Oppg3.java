package seksjon322;

import hjelpeklasser.Liste;
import hjelpeklasser.TabellListe;

public class Oppg3 {
    public static void main(String[] args) {

        String[] s = {"Sohil","Per","Thanh","Ann","Kari","Jon"};
        Liste<String> liste = new TabellListe<>(s);

        System.out.println(liste);
    }
}
