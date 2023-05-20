package day11;

public class Varrags2 {


    public static void main(String[] args) {

        // verilen degisken sayidaki tamsayidan
        // ilkinin karesini, digerlerinin toplamiyla carpan ve sonucu yazdiran bir method olusturun
        // from the given variable number of integers
        // create a method that multiplies the square of the first by the sum of the others and prints the result


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
