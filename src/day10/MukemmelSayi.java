package day10;

import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {


          /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

        Scanner scanner = new Scanner(System.in);

        int girilensayi = scanner.nextInt();

        perfectsayi(girilensayi);

    }

    public static void perfectsayi(int girilensayi) {

        int toplam = 0;

        for (int i = 1; i < girilensayi; i++) {
            if (girilensayi % i == 0) {
                toplam += i;

            }
        }

        if (toplam == girilensayi) {
            System.out.println("Mükemmel sayi");
        } else {
            System.out.println("sayi mükemmel değildir");
        }
    }
}
