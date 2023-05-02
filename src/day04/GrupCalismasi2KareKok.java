package day04;

import java.util.Scanner;

public class GrupCalismasi2KareKok {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        //bulunuz, tamkare ise true değilse false yazdırınız.
        //Ornek : input : 16, output: 4


        Scanner scanner = new Scanner(System.in);
        System.out.println("bir pozitif sayi griniz");

        boolean kareMi = false;
        int sayi = scanner.nextInt();
        int kare = 1;

        do {
            if (sayi == kare * kare) {
                kareMi = true;
                
            }
            kare++;

        } while ((kare * kare) <= sayi);
        System.out.println(kareMi);
    }
}
