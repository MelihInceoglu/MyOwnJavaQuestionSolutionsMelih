package InterFace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    public static final String E ="\u001B[35m";


    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println();
        System.out.printf(G + "%50s", "*******************\n");
        System.out.printf(B + "%50s", "********GEOMETRİK********\n");
        System.out.printf(Y + "%50s", "*******ŞEKİLLER*******\n");
        System.out.printf(R + "%50s", "********HESAPLAMA********\n");
        System.out.printf("%51s", "*******************\n\n");

        System.out.println();

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




