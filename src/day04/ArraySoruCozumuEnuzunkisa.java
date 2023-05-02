package day04;

public class ArraySoruCozumuEnuzunkisa {

    //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
    //olusturun.


    public static void main(String[] args) {


        String[] isim={"melih","hasan","burak","necdettin","su"};

        enuzunEnkisa(isim);

    }
    public static void enuzunEnkisa(String[]isim){

        String uzun=isim[0];
        String enKisaEleman=isim[0];

        for (int i = 0; i < isim.length ; i++) {
            if (isim[i].length()>uzun.length()){
                uzun=isim[i];


            }else if (isim[i].length()<enKisaEleman.length()){

                enKisaEleman=isim[i];
            }

        }
        System.out.println("kısa : "+enKisaEleman );

        System.out.println("En uzun : "+ uzun);


    }
}
