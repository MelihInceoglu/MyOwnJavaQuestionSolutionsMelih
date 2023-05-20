package day01;

import java.util.Arrays;

public class IncrementsAllArraysSayiEkleme {

    public static void main(String[] args) {


        // verilen bir int arrayinin tüm elemalarını 2 arttırma
        //increment all elements of a given int array by 2

        int[] arr = {12, 31, 4, 53, 6, 17, 83};

        Arrays.sort(arr);     // Sıraya sokar Natural order

        System.out.println(Arrays.toString(arr));  // arrayi yazdırmak için Arrays.toString(arr) yapıyoruz

        System.out.println(Arrays.toString(arrayeIkiEkle(arr))); // method oluşturduk

        


    }

    private static int[] arrayeIkiEkle(int[] arr) {

        int[] yeniArr=new int[arr.length]; // [0,0,0,0,0,]

        for (int i = 0; i <arr.length ; i++) {


            yeniArr[i]= arr[i]+2;

        }

        arr=yeniArr;



        return arr;



    }


}
