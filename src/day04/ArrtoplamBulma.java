package day04;

public class ArrtoplamBulma {


    //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.


    public static void main(String[] args) {

        int []arr={1,2,3,-3};

        int topla=toplama(arr);
        System.out.println(topla);


    }

    public static int toplama(int[]arr){


        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }else{
        }

    }
        return toplam;


}
}
