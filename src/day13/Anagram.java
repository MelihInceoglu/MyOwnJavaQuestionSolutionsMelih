package day13;

import java.util.Arrays;

public class Anagram {


    /*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */
    public static void main(String[] args) {

        String str1 = "kelime";
        String str2 = "melike";

        boolean isAnagram=false;

        str1=str1.toUpperCase();
        str2=str2.toUpperCase();

        String [] arr1=str1.split("");
        String [] arr2=str2.split("");

        Arrays.sort(arr1); // [E, E, K, L, M, İ]
        Arrays.sort(arr2); //[E, E, K, L, M, İ]

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if (Arrays.equals(arr1,arr2)){

            isAnagram=true;

        }
        System.out.println("isAnagram = " + isAnagram);

    }
}
