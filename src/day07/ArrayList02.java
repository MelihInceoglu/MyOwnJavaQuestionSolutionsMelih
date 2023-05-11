package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {

    //Soru 2- Kullanicidan istedigi kadar isim alip,
    // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isimler girinşiz bitirmek istediğinizd eq ya basiniz");

        List<String> liste=new ArrayList<String>();

        String isimler="";

        while (!isimler.contains("Q")){
           isimler=scan.nextLine().toUpperCase();

           liste.add(isimler);
        }
        liste.remove("Q");

        System.out.println(liste);






    }


}
