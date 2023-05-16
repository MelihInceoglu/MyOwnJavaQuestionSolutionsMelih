package day09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Toplanmak üzere 1.sayi giriniz");
        int sayi1= 0;
        try {

            sayi1 = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("tam sayi girmelisiniz");
        }
        System.out.println("Toplanmak üzere 2.sayi giriniz");
        int sayi2= 0;

        try {

            sayi2 = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Lutfen tam sayi degeri giriniz");
        }


        try {

            System.out.println("iki sayinin bolumu "+sayi1/sayi2);

        } catch (ArithmeticException e) {

            System.out.println("sayi 0 a bolunemez ");


        }


    }

}
