package day07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEachLoop {

    //Soru 2- Verilen int array’deki her elementin karelerini alip,
    // karelerinin toplamini yazdiran bir method olusturun.

    public static void main(String[] args) {

        int[] arr = {1, 2, 4};
        List<Integer> yeniArr = new ArrayList<>();
        int toplam=0;

        for (int each : arr) {
            toplam+=each*each;

            }
        System.out.println(toplam);

        }




    }



