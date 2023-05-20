package day08;

public class C01_ForEachLoop {

    public static void main(String[] args) {

        //Verilen bir arraydeki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[] melihler ={3,5,4,3,4};

        arrKareToplamalari(melihler);

    }


    public static void arrKareToplamalari(int[]arr){


        int toplam=0;

        for (int each:arr
             ) {
            toplam+=each*each;

        }

        System.out.println("arrayin elmanlari toplami: "+ toplam);
    }


}
