package day04;

public class GrupCWileLoopStringiTersCevirme {

    public static void main(String[] args) {

        String metin = "Melih";
        System.out.println(terscevirme2(metin));

    }

    public static String terscevirme2(String metin){
        String tersmetin=""; //hileM
        int harfler=metin.length()-1;//h

        while(harfler>=0){

            tersmetin+=metin.charAt(harfler);
            harfler--;

        }

return  tersmetin;
}


}