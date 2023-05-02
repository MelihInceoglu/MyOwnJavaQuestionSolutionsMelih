package day03;

import java.util.Scanner;

public class GrupCalismasiSifreOlusturma {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz");
        String sifre=scanner.nextLine();
        char krk= sifre.charAt(sifre.length()-1);
        int flag=0;
        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {
            flag++;
        }else{
            System.out.println("Sifrenin ilk harfi kucuk olmali");
        }
        if (krk>='0'&&krk<='9') {
            flag++;
        }else {
            System.out.println("son karakter rakam olmalı");
        } if (sifre.contains(" ")){
                System.out.println("Bosluk icermemeli");
            }else {
                flag++;
            }
            if (sifre.length()>=10){
                flag++;
            }else{
                System.out.println("Sifre 10 Haneden Büyük olmali");
            }
            if (flag==4) System.out.println("Sifre basiryla kaydedilmistir.");

        }
    }





