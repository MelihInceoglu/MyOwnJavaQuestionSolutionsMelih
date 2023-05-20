package day13;

import java.util.Arrays;
import java.util.Locale;

public class ArraysStringPickName {

    /*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

    public static void main(String[] args) {

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String [] arr = pickName.split("");

        System.out.println(Arrays.toString(arr)); //[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
        String A = "";
        String L = "";
        String I = "";
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].contains("A")){
                A = arr[i];
            }if (arr[i].contains("L")){
                L = arr[i];
            }if (arr[i].contains("I")){
                I = arr[i];
                I = I.toLowerCase(Locale.ENGLISH);
            }

        }
        System.out.println(A+" "+L+" "+I);

    }
}
