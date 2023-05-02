package day02;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayLists {


    public static void main(String[] args) {


        List<String> isimler=new ArrayList<>();

        isimler.add("Melih");
        isimler.add("Betul");
        isimler.add("Busra");

        System.out.println(isimler);    //[Melih, Betul, Busra]



        // Verilen bir array'deki elementleri yazdiralim
        // Ancak tekrar eden elementler varsa sadece 1 kere yazdirin

        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};

        List<Integer> tekrarsizListe= new ArrayList<>();


        for (int i = 0; i < sayilar.length ; i++) {

         if (!tekrarsizListe.contains(sayilar[i])){  //Tekrarsizliste sayilari içermiyorsa ekle

             tekrarsizListe.add(sayilar[i]);

         }

        }
        System.out.println(tekrarsizListe);



    }
}
