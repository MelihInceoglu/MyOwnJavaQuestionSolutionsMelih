package day08;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop06 {

    // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
    // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak farkli listeye
    // ekleyip yazdiran bir method hazirlayin

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18};


        teksayiciftsayilistesi(arr);

    }

    private static void teksayiciftsayilistesi(int[]arr) {



        List<Integer> ciftsayilar = new ArrayList<>();
        List<Integer> teksayilar = new ArrayList<>();

        for (int each : arr) {
            if (each % 2 == 0) {
                ciftsayilar.add(each);
            } else {
                teksayilar.add(each);
            }

        }
        System.out.println("teksayilar = " + teksayilar);
        System.out.println("ciftsayilar = " + ciftsayilar);

    }
}
