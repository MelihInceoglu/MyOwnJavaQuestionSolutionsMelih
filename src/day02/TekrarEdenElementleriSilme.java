package day02;

import java.util.ArrayList;
import java.util.List;

public class TekrarEdenElementleriSilme {
    public static void main(String[] args) {


    int[] sayilar={1,2,3,4,5,6,7,8,8,3,5,2,1,4,6,8,54,3};

    // Verilen bir array'deki elementleri yazdiralim
    // Ancak tekrar eden elementler varsa sadece 1 kere yazdirin


    List<Integer> tekrarsizYazdirma=new ArrayList<>(); //boş bir arry list hazırladık

        for (int i = 0; i <sayilar.length ; i++) {  // sayilarin uzunluguna kadar kontrol ettik

            if (!tekrarsizYazdirma.contains(sayilar[i])){  // sayilar i yaparak tek tek ele alıp tekrarsiz listemize
                                                            // içermiyorsa sayi ekleme yap dedik

                tekrarsizYazdirma.add(sayilar[i]);   // Sayiların i si yani tüm eleemntleri tekrar etmeyenleri
                                                            // add ile ekledik yeni listemize

            }

        }

        System.out.println(tekrarsizYazdirma);   //Tekrarsiz listemizi yazdirdik






    }
}
