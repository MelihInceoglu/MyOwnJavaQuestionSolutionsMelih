package day11;

public class Varrags {

    // istedigimiz kadar sayi girdigimizde
    // toplamlari bize veren bir method yazalim...


    public static void main(String[] args) {


        int sayi=0;

        System.out.println(toplamaSayilar(15,10,10,5,5));

    }

    public static int toplamaSayilar(int ... sayi) {
        int toplam=0;

        for (int each:sayi) {
            toplam+=each;

        }

        return toplam;
    }

}
