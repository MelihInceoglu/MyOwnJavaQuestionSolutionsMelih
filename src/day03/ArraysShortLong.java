package day03;

public class ArraysShortLong {

    public static void main(String[] args) {
        // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[]arr={"Melih","Betül","Busra","serkan","ayse"};

        enuzunenkisa(arr);

    }

    public static void enuzunenkisa(String[]arr){

       String uzun=arr[0];
        String kisa=arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()>uzun.length()){
                uzun=arr[i];

            }if(arr[i].length()<=kisa.length()){
                kisa=arr[i];
            }
        }
        System.out.println("en kısa : "+kisa);
        System.out.println("en uzun : "+uzun);


    }
}
