package day01;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class Kendi_calismam13 {

    public static void main(String[] args) {


        // Soru 3-  Verilen bir array’deki tum elementleri bir saga kaydirip,
        //          sondaki elementi de basa tasiyacak bir method olusturun,
        //          array’i yeni haliyle kaydedin.
        //		Orn :  input : [4,5,6,7]   array’in son hali. : [7,4,5,6]

        int[] degerler = {4, 5, 6, 7};

        degerler=dondurme(degerler);

        System.out.println(Arrays.toString(degerler));

    }

    public static int[] dondurme (int[]melih){


        int gecickova=melih[melih.length-1];    //son elelmanı aldı kenara koyduk


        for (int i = melih.length-2; i >=0 ; i--) {

            melih[i+1]=melih[i];

        }

      melih[0]=gecickova;


        return melih;

    }

}














