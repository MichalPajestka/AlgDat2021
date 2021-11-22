public class QuickSort {

    public static void main(String[] args) {

    }

    /**
     * Rekursiv funksjon som implementerer quicksort
     * ver
     * @param values
     * @param left
     * @param right
     */

    void quicksort(int[] values, int left, int right){
        //1. Bytte midterste verdi i arrayet til slutten
        // - se på verdien. Dette er skilleverdien (Pivot)
        int m = values.length / 2;  //Indeks til midterste verdi
        int r = values.length-1;    //Indekt til siste element i sub-arrayet
        int tmp = values[m];        //Ta vare på midt-verdien i en temp-variabel
        values[m] = values[r];      //Overskriv midt-variabelen med siste verdi i arrayet
        values[r] = tmp;            //Overskriv siste verdi i arrayet med temp-variabelen

        //2. Partisjoner arrayet fra start til "nest siste kort" (siste kort er midt-kortet)
        // - flytt alt som er større enn eller lik skilleverdi til høyre
        // - flytt alt som er mindre enn skilleverdi til venstre
        // - Ta var på indexen til den siste verdien som er mindre enn skilleverdi

        //3. Flytt skilleverdien (sist i arrayet ) tilbake til riktig sortert plass
        //   (rett til høyre for siste verdi som er mindre enn skilleverdi i punkt 2)

        //4. Gjenta for høyre sub-array og venstre sub-array
    }

}
