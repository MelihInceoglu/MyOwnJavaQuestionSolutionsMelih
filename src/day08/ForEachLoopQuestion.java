package day08;

public class ForEachLoopQuestion {

    public static void main(String[] args) {

         /*
        bir array icindeki sayilardan 5 ten buyuk olanlari toplayalim
        Let's add the numbers greater than 5 in an array
         */

        int[] arr = {5, 7, 6, 4, 2, 4};

        int toplam=0;

        for (int each:arr) {

            if (each>5){
                toplam+=each;
            }

        }
        System.out.println(toplam);

    }
}
