package day11;



public class Varrags3 {


    public static void main(String[] args) {

        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
       // Create a method called concat that concatenates the given Strings
        // input : "m", "e", "r", "v", "e";
        // output : merve

        concat("m","e","r","v","e");

    }

    public static void concat(String ... harfler) {
        String yeni="";

        for (String each:harfler) {
            yeni+=each;

        }
        System.out.println(yeni);

    }
}
