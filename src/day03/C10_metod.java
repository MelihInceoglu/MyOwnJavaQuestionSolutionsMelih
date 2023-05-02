package day03;

public class C10_metod {

    public static void main(String[] args) {

        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun





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
