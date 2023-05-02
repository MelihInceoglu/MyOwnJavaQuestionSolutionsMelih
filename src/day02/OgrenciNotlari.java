package day02;

import java.util.List;

public class OgrenciNotlari {
    // ogretmenden alınan ögrebci notlarinin ortalamasini ve kac ogrencinin ortalamanın ustunde not aldıgını
    //bize ulastiran bir metod yazin

    public static void main(String[] args) {

       List<Integer> notlarListesi= KullanicdanIntegerListOlusturma.kullanidanSayiAlarakOlusturanMethod();

                notOrtUstOgrenciSay(notlarListesi);
    }
    public static void notOrtUstOgrenciSay(List<Integer>notlarListesi){

        //not ortalamasi

        int toplamNot=0;
        int ortalamaNot=0;
        int sayac=0;

        for (int i = 0; i <notlarListesi.size() ; i++) {

            toplamNot+=notlarListesi.get(i);

        }
        ortalamaNot=toplamNot/notlarListesi.size();

        //not orrtalaması üzerindeki ogrenci sayisi

        for (int i = 0; i <notlarListesi.size() ; i++) {

            if (notlarListesi.get(i)>ortalamaNot){
                sayac++;

            }
        }
        System.out.println("Sinifin oratalama not :" +ortalamaNot);
        System.out.println(" Sınifta ortalama ustu ogrenci sayisi: " + sayac);
        System.out.println("Sınıftaki ogrenci sayisi :" +notlarListesi.size());

    }













}
