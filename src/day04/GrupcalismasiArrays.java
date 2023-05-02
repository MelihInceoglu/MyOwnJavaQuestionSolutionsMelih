package day04;

import java.util.Arrays;

public class GrupcalismasiArrays {


    //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    //olusturun. Eski array’i yeni haliyle kaydedin.

    public static void main(String[] args) {



        int []arr={1,3,5,7,9,3,4,6,73};

        elemeanArtirma(arr);

        System.out.println(Arrays.toString(arr));






    }
    public static int[] elemeanArtirma(int[]arr){

        int sayi=2;

        for (int i = 0; i <arr.length ; i++) {

            arr[i]+=sayi;

        }

        return arr;

    }







        }












