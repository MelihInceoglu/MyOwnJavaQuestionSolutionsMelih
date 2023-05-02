package day04;

import java.util.Arrays;

public class ArraySoruCozumuElemanEkleme {
    public static void main(String[] args) {

        String[] arr = {"melih", "hasan", "burak", "necdettin", "su"};

        elemanEkleme(arr);

    }

 public static String[] elemanEkleme(String[]arr){

        String[]yeniArr=new String[arr.length+1];
        String eklenecek="İbo";

     for (int i = 0; i < arr.length ; i++) {

         yeniArr[i]=arr[i];

     }

        yeniArr[yeniArr.length-1]=eklenecek;
    arr=yeniArr;

     System.out.println(Arrays.toString(arr));


     return arr;
 }



}