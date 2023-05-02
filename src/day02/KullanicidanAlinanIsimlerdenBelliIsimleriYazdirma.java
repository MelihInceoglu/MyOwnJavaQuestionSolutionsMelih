package day02;

import java.util.List;

public class KullanicidanAlinanIsimlerdenBelliIsimleriYazdirma {


    public static void main(String[] args) {

        //Kullanicdan alınan isimlerden olusan listede 3 harften fazla olanları yazdir


        List <String> yeniIsimler=KullaniciListeOlusturma.isimleriListelemeKaydetme();


        for (int i = 0; i <yeniIsimler.size() ; i++) {

            if (yeniIsimler.get(i).length()>=3){

                System.out.println(yeniIsimler.get(i));




        }

            }

        }















    }




