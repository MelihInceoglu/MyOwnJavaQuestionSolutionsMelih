package day01;

import java.util.Scanner;

public class FindUpperCaseLowerCaseSpaceNumbers {


    public static void main(String[] args) {


        // verilen bir metin'deki
        // buyuk harf , kucuk harf ve space sayilarini bulun
        // space sayisini gozonune alarak kac kelime oldugunu,
        // kac tane kucuk ve buyuk harf oldugunu yazdirin.

        // in a given text
        // find uppercase, lowercase and space numbers
        // take into account the number of space, how many words,
        // print how many lowercase and uppercase letters there are.


        Scanner scanner=new Scanner(System.in);

        String metin=scanner.nextLine();// Melih Guzel Iyi

        int buyuharf=0;
        int kucukharf=0;
        int spacesayisi=0;


        for (int i = 0; i <metin.length() ; i++) {

            char krk=metin.charAt(i);

            if ('A'<=krk&&krk<='Z'){
                buyuharf++;

            } else if ('a'<=krk&&krk<='z') {
                kucukharf++;


            }else if (krk==' '){
                spacesayisi++;


            }


        }
        System.out.println("Metiindeki kelme sayisi: " +(spacesayisi+1)+ "\n Kucuk harf sayisi :"+kucukharf +"\nBuyuk harf sayisi: "+buyuharf);




    }
}
