package day04;

public class ArraysToplama {



    static int toplam=0;

    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int []arr={1,3,5,-4};

        topladondur(arr);
        System.out.println(toplam);

    }
    public static int[] topladondur(int[]arr){

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>0){
            toplam+=arr[i];

        } else {

            }

            }
            return arr;

    }

}
