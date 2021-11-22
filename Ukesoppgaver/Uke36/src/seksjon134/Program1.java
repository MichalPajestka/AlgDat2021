package seksjon134;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        int[] a = {23, 4, 6, 1, 3, 7, 12, 5, 9, 10, 20, 13};
        System.out.println("Arrayet før sortering:");
        System.out.println(Arrays.toString(a));
        System.out.println("Arrayet etter sorterting");
        Tabell.utvalgssortering(a);
        Tabell.skriv(a);


    }
}
