package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList05 {

 //Soru 6- Kullanicidan pozitif bir tamsayi alip,
    //    o tamsayiyi tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun.

    public static void main(String[] args) {

       bolenListe();

    }

    private static List<Integer> bolenListe() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi= scanner.nextInt(); //20
        int sayac=0;

        List<Integer>bolenler=new ArrayList<>();

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                bolenler.add(i);
                sayac++;
            }
        }
        System.out.println(sayac+"adet sayi bolmustur "+ bolenler );


        return bolenler;

    }

}
