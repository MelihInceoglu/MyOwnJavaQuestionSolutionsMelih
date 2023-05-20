package day01;

import java.util.Arrays;

public class ArrayAllTheElementsIncrement {

    // Soru 1- Verilen bir int array’in tum elemanlarini
    //         istenen deger kadar artirip bize donduren bir method olusturun.
    //         Eski array’i yeni haliyle kaydedin.

    // Question 1- All the elements of a given int array
    // create a method that increments the desired value and returns it to us.
    // Save the old array as new.


    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’in tum elemanlarini
        //         istenen deger kadar artirip bize donduren bir method olusturun.
        //         Eski array’i yeni haliyle kaydedin.

        int[] sayilar = {3, 5, 7, 2, 1, 9,10};


       sayilar=ElemanlariArttirma(sayilar,3);

        System.out.println(Arrays.toString(sayilar));


    }

    public static int[] ElemanlariArttirma(int[]arr,int artisMiktari){

        for (int i = 0; i < arr.length ; i++) {

            arr[i]+=artisMiktari;


        }

        return arr;

    }

}
