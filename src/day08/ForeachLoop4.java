package day08;

import java.util.Scanner;

public class ForeachLoop4 {

    public static void main(String[] args) {


        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scanner.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        String harf=scanner.next();
        int sayac=0;


            String[]arr=cumle.split("");
        for (String each:arr) {

            if (each.equals(harf)){

                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("harf cumlede kullanılmamis");
        }else{
            System.out.println("aranan harf cumle icinde " + sayac+" kere kullanılmıstır");
        }


        }








    }


