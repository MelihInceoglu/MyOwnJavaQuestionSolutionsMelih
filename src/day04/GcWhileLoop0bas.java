package day04;

import java.util.Scanner;

public class GcWhileLoop0bas {


        static int sayi=1;

    public static void main(String[] args) {


        int toplam = 0;
        int adet = 0;


        Scanner scan = new Scanner(System.in);


        while (sayi != 0) {
            System.out.println("Toplanmak üsere sayi giriniz 0 basınız bitmesi için");
            sayi= scan.nextInt();

            if (sayi < 0) {
                System.out.println("negatif sayi giremzsiniz");

            } else if (sayi>0) {
                toplam += sayi;
                adet++;
            }
        }
        System.out.println(adet+" sayi girdiniz "+"/ " + toplam +" sayıların toplamıdır");
    }
}



