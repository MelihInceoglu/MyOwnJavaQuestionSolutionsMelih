package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KullanicdanIntegerListOlusturma {

    //Kullanicdan integer list olusturup donduren method olusturun


    public static void main(String[] args) {


        kullanidanSayiAlarakOlusturanMethod();
        List<Integer> SayiListemiz=kullanidanSayiAlarakOlusturanMethod();

        System.out.println(SayiListemiz);

    }

    public static List<Integer> kullanidanSayiAlarakOlusturanMethod(){


        Scanner scanner=new Scanner(System.in);

        //Kullanicdan loop içinde alıacaka, loop sayisi bilinmediğinden while
        //kullanıcı 0 a basınca loop dursun

        Integer girilenSayilar=1;

        List<Integer> SayiListemiz= new ArrayList<>();

        while(girilenSayilar!=0){

            System.out.println("Sayilar girin durmak istediginizde 0 a basin ");

            girilenSayilar=scanner.nextInt();

            if (girilenSayilar!=0){

                SayiListemiz.add(girilenSayilar);
            }




        }

        return SayiListemiz;
    }


}
