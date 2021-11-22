package seksjon134;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Program2 {
    public static void utvalgsSortering(int[] a){
        for (int i = 0; i < a.length - 1; i++){
            int m = i;
            int minverdi = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < minverdi) {
                    minverdi = a[j];
                    m = j;
                }
            }
            int temp = a[i];
            a[i] = a[m];
            a[m] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a =
                IntStream.generate(() -> new Random().nextInt(100000)).limit(100000).toArray();

        utvalgsSortering(a);
        System.out.println(Arrays.toString(a));

    }
}
