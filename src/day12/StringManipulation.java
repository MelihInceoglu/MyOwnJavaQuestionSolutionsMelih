package day12;

import java.util.Scanner;

public class StringManipulation {

    /*  TASK :
       Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
        Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
       */


    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");
    String isim1=scan.nextLine();

    int bosluk1=isim1.indexOf(" ");
    int bosluk2=isim1.indexOf(" ",bosluk1+1);

    String str1= isim1.substring(0,bosluk1).toUpperCase();
    String str2=isim1.substring(bosluk1+1,bosluk2).toUpperCase();
    String str3= isim1.substring(bosluk2+1).toUpperCase();

        System.out.println(str1.substring(0,1)+"."+str2.substring(0,1)+"."+str3.substring(0,1)+".");



}
}










