package day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserCreateListWhenUserPressStop {


    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //liste olarak dondurecek bir method olusturun.

        //Question 2- You can get as many names as you want from the user and give us the names they entered when they press Q.
        // create a method that will freeze it as a list.

        List<String> yeniIsimler = isimler();


        System.out.println(yeniIsimler);

    }

    public static List<String> isimler() {

        Scanner scanner = new Scanner(System.in);

        String girilenIsimler = "";

        List<String> isimlerListesi = new ArrayList<>();


        while (!girilenIsimler.equalsIgnoreCase("q")) {

            System.out.println("İSİMLER GİRİNİZ. btincede q ya basin");

            girilenIsimler = scanner.nextLine();

            isimlerListesi.add(girilenIsimler);

        }

        if (girilenIsimler.equalsIgnoreCase("q")) {

            isimlerListesi.remove("q");
        }
        return isimlerListesi;
    }

}











