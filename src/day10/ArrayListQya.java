package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQya {

     /*
    Soru 2- Kullanicidan istedigi kadar isim alip,
    Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.
     */
       static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Lutfen isimleri giriniz durdurmak için q ya basiniz");

        QyaBasDur();

    }

    public static List<String> QyaBasDur() {

        String isimler = "";
        List<String> arr = new ArrayList<>();

        while(!isimler.contains("Q")){
            isimler= scan.nextLine().toUpperCase();
            arr.add(isimler);

        }
        arr.remove("Q");


        System.out.println(arr);



    return arr;
    }


}
