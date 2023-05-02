package day01;

import java.util.Scanner;

public class Kendi_calismam1_UrunAdedi {

    public static void main(String[] args) {


        // Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri
        //karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin



        Scanner scan=new Scanner(System.in);

        System.out.println("Aldığı ürün adedi");

        int urunAdedi= scan.nextInt();

        System.out.println("Lütfen liste fiyatını giriniz");

        double fiyat= scan.nextDouble();

        System.out.println("Müşteri kartınız varsa E \n" +

                "Müşteri kartınız yoksa H giriniz");


        char kart=scan.next().toUpperCase().charAt(0);

        if (kart=='E'){

            if (urunAdedi>10) {

                System.out.println(urunAdedi*fiyat*0.8);}

            else {

                System.out.println(urunAdedi * fiyat * 0.85);
            }


        } else if (kart=='H') {



            if (urunAdedi>10) {

                System.out.println(urunAdedi*fiyat*0.85);}


            else {


                System.out.println(urunAdedi * fiyat * 0.90);
            }



        }else {
            System.out.println("Hatalı giriş yaptınız Lütfen tekrar deneyınız");


        }









        }





    }




