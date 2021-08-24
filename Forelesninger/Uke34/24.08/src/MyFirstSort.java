public class MyFirstSort {
    public static void main(String[] args) {

        int[] values = {1, 7, 2, 4, 6, 9};

        for (int k=0; k<values.length-1; ++k) {


        int max_index = findMax(values, k, values.length);
        System.out.println("Største verdi ligger på plass "
                + max_index + " og har verdi " + values[max_index]);

        //bytte plass på tall på plass 0 og max_index
        int temp = values[k];
        values[k] = values[max_index];
        values[max_index] = temp;

        System.out.println("Arrayet etter ombytting");
        for (int i=0; i<values.length; ++i){
            System.out.print(values[i] + ", ");
        }
        }
    }

    public static int findMax(int[] values, int fra, int til){
        //initialiser ved å se på første "kort"
        //Dette er det største tallet jeg har funnet så langt
        int index = 0;
        int max_value = values[0];

        //Sjekk at grensene fo løkken er riktig
        // [1, values.lengt)
        for (int i=0; i<values.length; ++i) {
            //sjekk om vi har funnet nytt største tall
            if (values[i] > max_value) {
                max_value = values[i];
                index = i;
            }
        }
        return index;
    }
}