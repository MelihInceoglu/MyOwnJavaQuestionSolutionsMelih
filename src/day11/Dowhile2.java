package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dowhile2 {

    public static void main(String[] args) {

        /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */


        Scanner scanner=new Scanner(System.in);


        try {
            String str=scanner.next();
            while(!str.equals("x")){
                str= scanner.next();
                System.out.println("Program calsiiiyor");

            }

            System.out.println("Program bitti");

        } catch (InputMismatchException e) {
            System.out.println("String giriniz yanlış girdiniz");
        }



    }


}
