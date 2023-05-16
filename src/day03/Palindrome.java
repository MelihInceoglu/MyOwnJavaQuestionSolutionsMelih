package day03;

import java.util.Scanner;

public class Palindrome {

    // Verilen bir String'in Palindrome olup olmadigini yazdirin
    // Palindrome : duzden ve tersten ayni sekilde yazilan
    // madam, 12321, kabak
    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfenyazi girizi");

        String metin=scanner.nextLine();

        String tersMetin=C10_metod.tersDondurme(metin);

        if (metin.equals(tersMetin)){

            System.out.println("girilen metin palindromedur");

        }else{

            System.out.println("pAlindrome degil");
        }




    }





        }
      







