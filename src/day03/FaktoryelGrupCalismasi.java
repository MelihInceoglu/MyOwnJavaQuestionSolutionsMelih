package day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FaktoryelGrupCalismasi {

    public static void main(String[] args) {


        System.out.println(kullanicdanSayiAlarakListeOlusturanMetod());


    }

    public static List<Integer> kullanicdanSayiAlarakListeOlusturanMetod() {

        List<Integer> yeniListe = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        int girilenSayi = 1;


        while (girilenSayi != 0) {
            System.out.println("Lutfen listeye eklemek için bir sayi giriniz");
            girilenSayi=scanner.nextInt();



            if (girilenSayi != 0) {
                yeniListe.add(girilenSayi);

            }


        }


        return yeniListe;
    }
}
