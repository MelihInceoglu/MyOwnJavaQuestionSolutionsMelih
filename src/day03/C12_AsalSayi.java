package day03;

public class C12_AsalSayi {

    //// Verilen 1'den buyuk pozitif bir tamsayinin
    //        // asal sayi olup olmadigini yazdiran bir method olusturun

    public static void main(String[] args) {

        asalMiBak(20);


    }

    public static void asalMiBak(int sayi){

        boolean asalMi=true;

        for (int i = 2; i <sayi ; i++) {

            if (sayi % i == 0){
                asalMi=false;
                break;

            }
        }
        /*
            Bir loop'un icerisinde loop'un calismasini durdurmak isterseniz
            break; yazabilirsiniz
         */

        if (asalMi){
            System.out.println(sayi + " sayisi asal");
        }else {
            System.out.println(sayi + " sayisi asal degil");



            }

            }


        }







