package day11;

public class Varrags2 {


    public static void main(String[] args) {

        // verilen degisken sayidaki tamsayidan
        // ilkinin karesini, digerlerinin toplamiyla carpan ve sonucu yazdiran bir method olusturun


        int sayi=0;


        carpimsonucu(5,1,2,3);

    }

    public static void carpimsonucu(int sayi, int ...sayilar) {

        int toplam=0;

        for (int each:sayilar) {
            toplam+=each;
        }
        System.out.println((sayi*sayi)*toplam);
    }
}
