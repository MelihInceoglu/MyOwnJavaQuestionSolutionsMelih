package InterFace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Hesaplamak istediginiz geometrik sekli seciniz :\n" +
                "1. Dikdortgen\n" +
                "2. Kare\n" +
                "3. Daire\n" +
                "Cikis icin Q harfine basiniz...");
        try {
            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    Dikdortgen dikdortgen = new Dikdortgen();
                    dikdortgen.cevre();
                    dikdortgen.alan();
                    menu();
                }
                case 2: {
                    Kare kare = new Kare();
                    kare.cevre();
                    kare.alan();
                    menu();
                }
                case 3: {
                    Daire daire = new Daire();
                    daire.cevre();
                    daire.alan();
                    menu();
                }
                default: {
                    System.out.println("Hatali sayi girdiniz... ");
                    menu();
                }
            }
        } catch (InputMismatchException e) {
            char secim = scan.next().toUpperCase().charAt(0);
            if (secim == 'Q') {
                System.out.println(" Cıkıs yapiliyor...");
                System.exit(0); // cıkıs yaptıgını gosteriri

            } else {
                System.out.println("Hatali giris yaptiniz...");
                menu();
            }
        }
    }
}



