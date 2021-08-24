import java.util.Arrays;

public class Oppgave3 {
    public static void main(String[] args) {

        int[] a = {20, 8};

        System.out.println(Arrays.toString(minmaks(a)));

    }

    public static int[] minmaks(int[] a){
        int m1 = 0;
        int m2 = 0;

        for (int i=1; i<a.length; ++i){


            if (a[i] > a[m2]){
                m2 = i;
            }
            else {
                if (a[i] < a[m1]){
                    m1 = i;
                }
            }
        }
       return new int[]{m1, m2};
    }
}
