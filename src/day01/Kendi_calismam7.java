package day01;

import java.util.Scanner;

public class Kendi_calismam7 {

    // Kullanicidan alinan karekterlerin string olup olmadigini kontrol eden bir java program yaziniz


    static Scanner scan = new Scanner(System.in);

    public static void stringMiControl() {

        System.out.println("Lutfen Bir Strin giriniz");

        if (scan.hasNextInt()) {

            int data=scan.nextInt();

            System.out.println("yannlış girdiniz düzeltiniz");

            stringMiControl();



        }else if (scan.hasNextDouble()) {

            double data= scan.nextDouble();

            System.out.println("hatalı giriş yaptınız");

            stringMiControl();

        }else if (scan.hasNext()){

            String data= scan.nextLine();

            System.out.println("Tebrikler doğru giriş yaptınız");



        }



    }

    public static void main(String[] args) {
        stringMiControl();
    }

    }



















