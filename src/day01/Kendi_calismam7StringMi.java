package day01;

import java.util.Scanner;

public class Kendi_calismam7StringMi {


    public static void main(String[] args) {


        StrDondurme();


    }






          public static void StrDondurme(){

              Scanner scanner = new Scanner(System.in);


              // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.


              String str = scanner.nextLine(); //melih

              String tersMetin = "";

              for (int i = str.length() - 1; i >= 0; i--) {

                  tersMetin += str.charAt(i);


              }
              System.out.println(tersMetin);







          }




}


