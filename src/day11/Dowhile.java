package day11;

import java.util.Scanner;

public class Dowhile {


    public static void main(String[] args) {

        /*
         *kullanicidan alınan sayinin basamak degerlerinin toplamini while loop ile yapin bir method create ediniz.
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
