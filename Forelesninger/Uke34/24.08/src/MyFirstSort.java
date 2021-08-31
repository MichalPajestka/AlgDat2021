/**
 * Windows: [alt] + [enter] mens du holder på klassen for å lage tester
 * Mac: [option] + [enter] --"--
 */
public class MyFirstSort {

    public static void main(String[] args) {
        System.out.println("Hello algdat");

        int values[] = {1, 7, 2, 4, 6, 9};

        myFirstSort(values);
    }

    /**
     * Denne funksjonen tar inn ett array med verdier (heltall),
     * og sorterer dem "in place"
     * @param values Verdier vi skal sortere.
     */
    public static void myFirstSort(int[] values) {
        for (int k=0; k<values.length-1; ++k) {
            //Sjekk at vi får fornuftig svar for *ett* tilfelle.
            //Vi må utføre ordentlig testing før vi
            //faktisk kan stole på kildekoden vår
            int max_index = findMax(values, k, values.length);
            //System.out.println("Største verdi ligger på plass "
            //        + max_index + " og har verdi " + values[max_index]);

            //Bytte plass på tall på plass 0 og max_index
            int temp = values[k];
            values[k] = values[max_index];
            values[max_index] = temp;

            //System.out.println("Bytter plass " + k + " med plass " + max_index);
            //System.out.println("Arrayet etter ombytting");
            //for (int i = 0; i < values.length; ++i) {
            //    System.out.print(values[i] + ", ");
            //}
            //System.out.println();
        }
    }

    /**
     * Findmax - finner index til største tall i et array,
     * men søker bare innenfor tallene i [fra, til)
     */
    public static int findMax(int[] values, int fra, int til) {
        //Initialiser ved å se på første "kort"
        //Dette er det største tallet jeg har funnet
        //så langt
        int index = fra;
        int max_value = values[fra];

        //Sjekk at grensene for løkken er riktig.
        // [1, values.length)
        for (int i=fra+1; i<til; ++i) {
            //Sjekk om vi har funnet nytt største tall
            if (values[i] > max_value) {
                max_value = values[i];
                index = i;
            }
        }

        return index;
    }

    public static int findTwoMax(int[] values, int fra, int til) {
        if (til-fra < 2){
            throw new ArrayIndexOutOfBoundsException("Feil i grenser");
        }
        if (fra < 0) {
            throw new ArrayIndexOutOfBoundsException("Fra er negativ");
        }
        if (til < 2) {
            throw new ArrayIndexOutOfBoundsException("Til er ikke lang nok");
        }
        //Test at vi ikke har for stor til-verdi
        //Indekser:             0  1  2  3  4  5
        //values.length = 6
        //Started med verdiene {1, 7, 2, 4, 6, 9}
        if (til > values.length){
            throw new ArrayIndexOutOfBoundsException("");
        }



        //Initialiser ved å se på første "kort"
        //Dette er det største tallet jeg har funnet
        //så langt
        int index_max = fra;
        int index_nest_max = fra+1;

        int max_value = values[fra];
        int nest_max_value = values[fra+1];

        //Hvis nest_max_value har en verdi som er større
        //enn variablen max_value, så må vi bytte dem.
        if(max_value < nest_max_value) {
            //disse burde refaktoreres i en swap(...) metode
            //for å gjøre koden mer lesbar og mindre sjanse
            //for feil.
            int temp = max_value;
            max_value = nest_max_value;
            nest_max_value = temp;

            temp = index_max;
            index_max = index_nest_max;
            index_max = temp;

        }

        //Status så langt:
        //Array: {1, 7, 2, 4, 6, 9};
        //Vi har sett på de tp første elementen {1, 7}
        //max_Value = 7, index_max = 1
        //nest_max_value = 1, index_nestmax = 0
        //Nå må vi løpe gjennom resten av arrayet

        //Sjekk at grensene for løkken er riktig.
        //Intervallet vårt e [fra, til]
        //Siden vi har sjekket de to første tallene, begynner vår
        //for-løkke på fra+2
        for (int i=fra+2; i<til; ++i) {

            //Tilfelle 1: nytt største tall:
            if (values[i] > max_value){
                int temp = max_value; //tallet 7 i vårt tilfelle
                max_value = values[i]; //f.eks. 14
                nest_max_value = temp; //tallet 7

                //oppdater indeksene
                temp = index_max;
                index_max = i;
                index_nest_max = temp;
            }
            else if (values[i] > nest_max_value){
                nest_max_value = values[i];
                index_nest_max = i;
            }
            else {
                //ingenting, max og nest mx er større enn begge to.
            }

            //Sjekk om vi har funnet nytt største tall
            if (values[i] > max_value) {
                max_value = values[i];
                index = i;
            }
        }

        return index;
    }
}