package day12;

import java.util.Arrays;

public class FindMaxMinNumberArray {


    /*TASK :
   write a java program to find the second largest number in the array?
   Maximum and minimum number in the array?

   (Array'deki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
   bulmak için bir java programi yazin)

   int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

   */
    public static void main(String[] args) {


        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        Arrays.sort(arr);
        int enBuyukS=arr[0];
        int enKucukS=arr[arr.length-1];
        int ikinciEnBuyuk=arr[arr.length-2];

        System.out.println(Arrays.toString(arr)); //[-90, -90, 0, 1, 100, 845, 898, 8787, 10001]

        for (int i = 0; i < arr.length; i++) {

            if (enBuyukS<arr[i]){
                enBuyukS = arr[i];
            }if (enKucukS>arr[i]){
                enKucukS =arr[i];
            }if (ikinciEnBuyuk<enBuyukS){
                ikinciEnBuyuk=arr[arr.length-2];
            }

        }

        System.out.println("En buyuk sayi: "+ enBuyukS + "\nEn kucuk sayi :" + enKucukS);
        System.out.println(ikinciEnBuyuk);

      // System.out.println("En buyuk sayi :" + Arrays.stream(arr).max().getAsInt());
      // System.out.println("En kucuk sayi :" + Arrays.stream(arr).min().getAsInt());
      // System.out.println("En buyyk ikinci sayi :"
      // +Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).skip(1).max().getAsInt());




    }


    }


