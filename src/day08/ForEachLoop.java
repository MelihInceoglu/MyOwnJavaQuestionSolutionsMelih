package day08;

public class ForEachLoop {

    public static void main(String[] args) {

         /*
        bir array icindeki sayilardan 5 ten buyuk olanlari toplayalim
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
