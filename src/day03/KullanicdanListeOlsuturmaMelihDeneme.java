package day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KullanicdanListeOlsuturmaMelihDeneme {
    //kullanicidan alinan isimleri listeye yazdiran bir method girin

    public static void main(String[] args) {
        System.out.println(StringCikarmaListesi());
    }

    public static List<String> StringCikarmaListesi() {

        Scanner scanner = new Scanner(System.in);

        String kullaniciGirdis = "";
        List<String> GirilenIsimler = new ArrayList<>();

        while (!kullaniciGirdis.equalsIgnoreCase("0")) {

            System.out.println("Stringleri girmeye başlayınız");

            kullaniciGirdis=scanner.next();

            GirilenIsimler.add(kullaniciGirdis);

            if (GirilenIsimler.contains("0")){
                GirilenIsimler.remove("0");

            }
        }
        return GirilenIsimler;

    }
}
