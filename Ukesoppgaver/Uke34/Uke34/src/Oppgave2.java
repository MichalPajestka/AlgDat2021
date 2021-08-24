public class Oppgave2 {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 20};
        int maks_index = maks(a);
        System.out.println(maks_index);
        System.out.println(a[maks_index]);
    }

    static int maks(int[] a) {
        // initialiser med første element
        int maks_value = a[0];
        int maks_index = 0;

        // loop over alle resterende elementer og sjekk om vi
        //finner et mindre tall
        for (int i=1; i<a.length; ++i) {
            int value = a[i];
            int index = i;

            //sjekk om verdien er større enn det vi har sett tidligere
            if (value >= maks_value){
                maks_value = value;
                maks_index = index;
            }
        }
        // returner index til største verdi
        return maks_index;
    }
}



