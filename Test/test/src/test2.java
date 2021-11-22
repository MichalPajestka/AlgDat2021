import java.util.Arrays;

public class test2 {

    public static boolean inneholdt(String a, String b){
       char[] A = a.toCharArray();
       char[] B = b.toCharArray();

       Arrays.sort(A);
       Arrays.sort(B);

       return Arrays.equals(A,B);


    }

    public static void main(String[] args) {
        String A = "ABBAA";
        String B = "BAAB";
        System.out.println(inneholdt(A,B));

    }
}
