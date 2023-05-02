package day02;

import java.util.Arrays;

public class TumElementlereUlasma {

    public static void main(String[] args) {

        int[][] arr = {{1,5,9},{3,4},{2,8,1,2},{10}};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                System.out.print(arr[i][j] + " ");

            }

        }
        System.out.println();
        
        //Tum Elmentlerin Toplamını yazdirma
        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];

            }

        }

        System.out.println(toplam);

        //MDA daki en büyük elementi yazdirin
        
        int enBuyukSayi=arr[0][0];

        for (int i = 0; i <arr.length ; i++) { // outer arrye bakar

            for (int j = 0; j <arr[i].length; j++) {  // inner arrayae bakar
                
                if (arr[i][j]>enBuyukSayi);
                
                enBuyukSayi=arr[i][j];
            }

        }
        System.out.println("enBuyukSayi = " + enBuyukSayi); // 10

        System.out.println();


        //MDA DAKİ ÇİFT SAYILARİ YAZDİRİN

        int ciftSayiAdedi=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]%2==0){

                    System.out.print(arr[i][j]+" ");  //4 2 8 2 10

                    ciftSayiAdedi++;

                }
            }
        }

        System.out.println("\nciftSayiAdedi = " + ciftSayiAdedi);


        }

    }








