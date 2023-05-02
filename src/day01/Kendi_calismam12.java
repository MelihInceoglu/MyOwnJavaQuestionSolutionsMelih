package day01;

public class Kendi_calismam12 {

    public static void main(String[] args) {

        // Soru 4-  Verilen bir array’de
        //          istenen bir elemanin var olup olmadigini
        //          ve varsa kac kere kullanildigini yazdiran bir method olusturun.


        String[] SinifListesi= {"Saida","Isa","Asil","Kubra","Elif","Yusuf","isa"};
        String arananIsim="Asil";

        ArananEleman(SinifListesi,arananIsim);









    }


        public static void ArananEleman(String []arr, String arananIsim){


        int sayac=0;


            for (int i = 0; i < arr.length ; i++) {

                if (arr[i].equalsIgnoreCase(arananIsim)){

                    sayac++;
                }

            }


            System.out.println("Aradığınız kişinin sayisi: " + sayac+ " Kişidir"+
                                "\nAradığınız isim : "+arananIsim);
        }


}
