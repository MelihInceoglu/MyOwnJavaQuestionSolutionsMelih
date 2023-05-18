package day11;

import java.util.Scanner;

public class Dowhile3 {

    public static void main(String[] args) {

        /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil 20
        */

        Scanner scanner=new Scanner(System.in);// 15   1 3 5 15

        int girilenSayi=scanner.nextInt();
        int bas=1;

        while(bas<=girilenSayi){
            if (bas%2!=0){
                System.out.println(bas);
            }
            bas++;
        }


    }



}
