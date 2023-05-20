package day01;

import java.util.Scanner;

public class CheckStrings {

    // Kullanicidan alinan karekterlerin string olup olmadigini kontrol eden bir java program yaziniz

    // Write a java program that checks whether the characters received from the user are strings


    static Scanner scan = new Scanner(System.in);

    public static void stringMiControl() {

        System.out.println("Lutfen Bir String giriniz");

        if (scan.hasNextInt()) {

            int data = scan.nextInt();

            System.out.println("yanlış girdiniz düzeltiniz");

            stringMiControl();


        } else if (scan.hasNextDouble()) {

            double data = scan.nextDouble();

            System.out.println("hatalı giriş yaptınız");

            stringMiControl();

        } else if (scan.hasNext()) {

            String data = scan.nextLine();

            System.out.println("Tebrikler doğru giriş yaptınız");

        }
    }

    public static void main(String[] args) {
        stringMiControl();
    }

}



















