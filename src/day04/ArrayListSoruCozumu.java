package day04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSoruCozumu {

    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun

        List <Integer> liste=new ArrayList<>();

        liste.add(1);
        liste.add(5);
        liste.add(7);
        liste.add(7);
        liste.add(1);
        liste.add(6);
        liste.add(8);

        mukerrerSilme(liste);

    }
    public static List<Integer> mukerrerSilme(List<Integer>liste){
        List<Integer>tekrarsizliste=new ArrayList<>();

        for (int i = 0; i <liste.size()  ; i++) {
            if (!tekrarsizliste.contains(liste.get(i))){
                tekrarsizliste.add(liste.get(i));

            }

                //  if (!tekrarsizYazdirma.contains(sayilar[i]))

        }
        System.out.println(tekrarsizliste);


        return tekrarsizliste;
    }
}
