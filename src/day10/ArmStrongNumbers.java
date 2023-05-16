package day10;

import java.util.Scanner;

public class ArmStrongNumbers {


    public static void main(String[] args) {


         /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scanner.nextInt();

        int basamakDegeri = 0;
        int kuplerToplami = 0;
        int n = sayi;

        while (n > 0) {
            basamakDegeri = n % 10;
            kuplerToplami += basamakDegeri * basamakDegeri * basamakDegeri;
            n = n / 10;
        }

        if (sayi == kuplerToplami) {
            System.out.println(sayi + " : Sayi  Armstrong sayidir");
        } else {
            System.out.println("Sayi  Armstrong sayisi degildir");
        }


    }
}
