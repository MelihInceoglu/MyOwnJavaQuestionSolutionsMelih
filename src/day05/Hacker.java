package day05;

import java.util.Scanner;

public class Hacker {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz");
        String girilenCumle= scanner.nextLine().toLowerCase();

        cevirenKod(girilenCumle);

    }

    private static void cevirenKod(String girilenCumle) {

        String arr[]=new String[girilenCumle.length()];

        for (int i = 0; i <girilenCumle.length() ; i++) {

            arr[i]=girilenCumle.substring(i,i+1);
            System.out.print(arr[i]);

        }

        System.out.println();

        for (int i = 0; i <girilenCumle.length() ; i++) {

            if (arr[i].contains("s")){
                arr[i]="5";

            }if (arr[i].contains("a")){
                arr[i]="4";

            }if (arr[i].contains("e")){
                arr[i]="3";

            }if (arr[i].contains("i")){
                arr[i]="1";

            }if (arr[i].contains("o")){
                arr[i]="0";

            }
            System.out.print(arr[i]);
        }

    }
}
