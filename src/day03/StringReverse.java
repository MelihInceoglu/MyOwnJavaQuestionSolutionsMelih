package day03;

public class StringReverse {

    public static void main(String[] args) {

        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun

        // Reverse a given String
        // create a method that freezes us



       String yeniHali= tersDondurme("java");
        System.out.println(yeniHali);


    }
    public static String tersDondurme(String metin){

        String tersMetin="";

        for (int i =metin.length()-1 ; i >=0 ; i--) {

            tersMetin +=metin.charAt(i);

        }

        return tersMetin;
    }


}
