package day04;

public class  ArrayListGrupcalismasi {


    public static void main(String[] args) {

         /*
    Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
    olusturacagimiz tek katli bir array’e bu toplamlari atayin.
    input : int[][] arr = {{3,4,5}, {2,3,6,7}};
    output: [5, 7, 11]
     */

        // int[][]arr={{1,2,3},{2,5,8,2}};

        // int uzunluk= arr[0].length< arr[1].length ?arr[0].length:arr[1].length;

        // int[] ortakElementler=new int[uzunluk];

        // for (int i = 0; i < ortakElementler.length ; i++) {
        //     ortakElementler[i]=arr[0][i]+arr[1][i];


        // }

        // System.out.println(Arrays.toString(ortakElementler));

        // int[][]arr={{1,2,3},{2,5},{2,5,8,2,54,654,423,2,1},{2,5,8,2}};


        int[][] arr = {{1, 2, 3}, {4, 5, 3}, {8,2},{1,4,5,6}};


        int minlength = arr[0].length;
        for (int[] each : arr) {
            if (each.length < minlength) {
                minlength = each.length;
            }


        }

        }





    }

