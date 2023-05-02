package day03;

import java.util.Scanner;

public class GrupCalismasiWhileLoop {

    public static void main(String[] args) {

    //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.



        Scanner scanner=new Scanner(System.in);
        int girilensayi= scanner.nextInt();

        int birlerBasamagi=0;
        int toplamsayi=0;
        int sayi=girilensayi;


        while(sayi>0){

            birlerBasamagi=sayi%10;
            toplamsayi+=birlerBasamagi;
            sayi/=10;

        }

        System.out.println(toplamsayi);


    }







}
