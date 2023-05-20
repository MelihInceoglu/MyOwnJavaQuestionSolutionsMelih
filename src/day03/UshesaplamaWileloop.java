package day03;

import java.util.Scanner;

public class UshesaplamaWileloop{


    public static void main(String[] args) {
        usHesapla();

    }


    // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
    // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.

    // Question 5- Ask the user for a number and the reason he wants to calculate.
    // Create a method that calculates and prints the desired prime of the given number using the while loop.


public static void usHesapla(){

    Scanner scan=new Scanner(System.in);
    System.out.println("Lütfen bir tamsayı gırınız");
    int  sayi= scan.nextInt();
    System.out.println("Lütfen hesaplamak istedıgınız ussu giriniz");
    int us= scan.nextInt();

    int carpimsonuc=0;
    while (us!=0){

        carpimsonuc=sayi*sayi;
        us--;
    }
    System.out.println("çarpım sonucu : " +carpimsonuc);


}
}

