package InterFace;

import java.util.Scanner;

public class Daire implements Iislemler {

    static double yaricap, cevreSonuc, alanSonuc;
    Scanner scan = new Scanner(System.in);

    @Override
    public void cevre() {
        System.out.println("Dairenin yariyapini giriniz :");
        yaricap = scan.nextDouble();
        cevreSonuc = 2 * yaricap * Math.PI;
        System.out.println("Dairenin cevresi :" + cevreSonuc);
    }

    @Override
    public void alan() {
        alanSonuc = Math.PI * Math.pow(yaricap, 2);
        System.out.println("Dairenin alani :" + alanSonuc);


    }
}