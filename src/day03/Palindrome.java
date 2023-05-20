package day03;

import java.util.Scanner;

public class Palindrome {

    // Verilen bir String'in Palindrome olup olmadigini yazdirin
    // Palindrome : duzden ve tersten ayni sekilde yazilan
    // madam, 12321, kabak

    // Print whether a given String is Palindrome
    // Palindrome : written the same way in straight and reverse
    // madam, 12321, pumpkin
    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfenyazi girizi");

        String metin=scanner.nextLine();

        String tersMetin= StringReverse.tersDondurme(metin);

        if (metin.equals(tersMetin)){

            System.out.println("girilen metin palindromedur");

        }else{

            System.out.println("pAlindrome degil");
        }




    }





        }
      







