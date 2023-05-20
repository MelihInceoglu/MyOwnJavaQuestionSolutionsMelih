package day11;

import java.util.Scanner;

public class Dowhile {


    public static void main(String[] args) {

        /*
         Make the sum of the digits of the number received from the user with a while loop, create a method.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen tam bir sayi giriniz");//1234

        int sayi = scanner.nextInt();


        System.out.println(basamaktoplami(sayi));

    }

    public static int basamaktoplami(int sayi) {

        int toplam = 0;
        while (sayi != 0) {

            toplam += sayi % 10;
            sayi /= 10;

        }
        return toplam;
    }
}
