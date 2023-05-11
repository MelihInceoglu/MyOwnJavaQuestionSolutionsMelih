package day07;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

//Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
// tum elemanlardan	sadece 1 tane yapip bize dondurecek bir method olusturun.


    public static void main(String[] args) {

    int[] arr={1,2,4,6,4,3,2,1,3,5,7,5,3,2,1,3,4,6,8};

tekrarEden(arr);

    }

    private static int[] tekrarEden(int[]arr) {

        List<Integer>yeniArr=new ArrayList<>();


        for (int i = 0; i <arr.length ; i++) {
            if (!yeniArr.contains(arr[i])){
                yeniArr.add(arr[i]);
            }
        }
        System.out.println(yeniArr);


        return arr;
    }


}
