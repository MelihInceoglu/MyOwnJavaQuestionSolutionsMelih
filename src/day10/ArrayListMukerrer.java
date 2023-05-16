package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMukerrer {

    public static void main(String[] args) {

        /*
     Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
     tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
     */
        int[]arr={1,2,34,4,2,2,4,5,7,5,4,3,5};
        tekrarEden(arr);
    }

    public static void tekrarEden(int[]arr) {


        List<Integer>yeniArr=new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {
            if (!yeniArr.contains(arr[i])){
                yeniArr.add(arr[i]);
            }

        }
        System.out.println(yeniArr);
    }

}
