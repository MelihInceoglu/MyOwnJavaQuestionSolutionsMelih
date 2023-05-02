package day03;

public class GrupcalimasiAsalMi {

    public static void main(String[] args) {


        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        //sonuclarini donduren bir method olusturun.

       asalMi(12);

            }

    public static int asalMi(int sayi) {

        boolean asalMi=true;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){

                asalMi=false;

                break;
            }
        }

        if (asalMi){
            System.out.println("sayisi asal");

        }else{
            System.out.println("asal degil");
        }

        return sayi;
    }


}

















