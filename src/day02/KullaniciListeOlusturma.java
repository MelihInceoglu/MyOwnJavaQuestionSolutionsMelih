package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KullaniciListeOlusturma {


    public static void main(String[] args) {


        System.out.println(isimleriListelemeKaydetme());


    }

    public static List<String> isimleriListelemeKaydetme() {

        Scanner scanner = new Scanner(System.in);

        String kullaniciGirdisi = "";

        List<String> isimler = new ArrayList<>();

        while (!kullaniciGirdisi.equalsIgnoreCase("0")) {

            System.out.println("Lutfen listeye eklemek icin bir isim giriniz");

            kullaniciGirdisi = scanner.next();


            if (!kullaniciGirdisi.equalsIgnoreCase("0")) {

                isimler.add(kullaniciGirdisi);   // KUllanıcı 0 a basarsa 0 ekleme add bloğuna

            }
        }

        return isimler;


    }
}








