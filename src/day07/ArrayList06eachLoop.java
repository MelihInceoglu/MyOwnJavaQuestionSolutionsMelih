package day07;

import java.util.ArrayList;
import java.util.List;

public class ArrayList06eachLoop {

    //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
    // tum elemanlardan	sadece 1 tane yapip eski array’e yeni halini atayip yazdirin
    public static void main(String[] args) {


        int[] arr = {1, 2, 4, 6, 4, 3, 2, 1, 3, 5, 7, 5, 3, 2, 1, 3, 4, 6, 8};

        List<Integer> yeniArr = new ArrayList<>();

        for (int each : arr) {
            if (!yeniArr.contains(arr[each])) {
                yeniArr.add(arr[each]);

            }

        }
        System.out.println(yeniArr);
    }
}