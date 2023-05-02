package day03;

import java.util.Scanner;

public class GrupCalismasi {

    //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int girilenSayi= scanner.nextInt(); //1453

        int basamakSayisi=(""+girilenSayi).length();

        int rakam=0;

        int rakamlarToplami=0;

        for (int i = 0; i <=basamakSayisi ; i++) {


            rakam= girilenSayi%10;

            rakamlarToplami+=rakam;

            girilenSayi=girilenSayi/10;

            //girilenSayi/=10;



        }
        System.out.println(rakamlarToplami);



    }







}
