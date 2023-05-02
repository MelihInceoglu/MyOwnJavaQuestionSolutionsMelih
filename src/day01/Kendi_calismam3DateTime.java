package day01;

import java.awt.*;
import java.util.Arrays;

public class Kendi_calismam3DateTime {

    public static void main(String[] args) {

   //  Date now=new Date();
     //   System.out.println(now);  tarih yazdırır saat

        Point point1=new Point(1,1);
        Point point2=point1;
        point1.x=6;
        System.out.println(point2);
        point1.y=3;
        System.out.println(point1);


        int[] numbers =new int[8];
        numbers[0]=1;
        numbers[1]=3;
        numbers[4]=6;
        System.out.println(Arrays.toString(numbers));


        int[] numb ={2,3,4,5,1,4};
        System.out.println(numb.length); // uzunlluk 6

        System.out.println(Arrays.toString(numb).repeat(3)); //Kod tekrarı yapıyor


        int[][] IkiKumeYapma={{1,3,5},{5,7,9}};

        System.out.println(Arrays.deepToString(IkiKumeYapma)); // deep to string  [[1, 3, 5], [5, 7, 9]]

        System.out.println("----------------------------------------");

        String mel ="123";                  //Stringi intgerla işlemem sokmak icin parse int metodu kullanılır.
        int Mal=Integer.parseInt(mel)+10;
        System.out.println(Mal);


    }



}
