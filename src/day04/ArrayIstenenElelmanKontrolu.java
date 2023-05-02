package day04;

public class ArrayIstenenElelmanKontrolu {

    public static void main(String[] args) {

        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int[]arr={1,2,3,5,2,2,1,8}; //

        mukerrer(arr,8);

    }

    public static void mukerrer(int[]arr,int istenen){

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==istenen){
                sayac++;
            }

        }
        System.out.println("İstenen eleman :" +sayac+" tane vardır");


    }
}
