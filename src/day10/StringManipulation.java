package day10;

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */


        Scanner scanner=new Scanner(System.in);

        String kelime= scanner.nextLine();


        kelime=kelime.substring(0,1)+kelime.substring(kelime.length()-1);

        System.out.println(kelime);

        int sayi= scanner.nextInt();

        String yeniKelime="";

        for (int i = 0; i <sayi ; i++) {
            yeniKelime+=kelime;

        }

        System.out.println(yeniKelime);


        }

        }





