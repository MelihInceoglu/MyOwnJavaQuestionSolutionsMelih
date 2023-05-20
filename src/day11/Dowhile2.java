package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dowhile2 {

    public static void main(String[] args) {

        /*
    "Program is running" on the screen until x is entered in the user
    and when x is entered, write the program that says "Program finished".
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
