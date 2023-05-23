package InterFace;

import java.util.Scanner;

public class Dikdortgen implements Iislemler {

    Scanner scan = new Scanner(System.in);
    static int kisaKenar, uzunKenar, cevreSonuc, alanSonuc;

    @Override
    public void cevre() {
        System.out.println("Kısa kenar uzunlugunu giriniz.");
        kisaKenar = scan.nextInt();
        System.out.println("Uzun kenar uzunlugunu giriniz");
        uzunKenar = scan.nextInt();
        cevreSonuc = 2 * (kisaKenar + uzunKenar);
        System.out.println("Dikdortgenin cevresi :" + cevreSonuc);

    }

    @Override
    public void alan() {
        alanSonuc = kisaKenar * uzunKenar;
        System.out.println("Dikdortgenin Alani :" + alanSonuc);

    }
}

