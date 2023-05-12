package day08;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop10 {


    public static void main(String[] args) {


       //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        int[]arr={1,2,3,4,5,67,8,99,97,32};
        int[]ikinciArr={45,32,56,99,97,10,11,23,12};

        List<Integer>yeniListe=new ArrayList<>();

        for (int i:ikinciArr) {
            for (int each:arr) {
                if (each==i){
                    yeniListe.add(each);
                }
        }

        }
        System.out.println("yeniListe = " + yeniListe);

        System.out.println("------------------------String liste----------------------------");

        String[]liste={"ayse","aysegul","melih","hakkı"};
        String[]listeIkinci={"ayse","aysegul","hakkı"};

        List<String>isimKiyaslama=new ArrayList<>();

        for (String each:liste) {
            for (String j:listeIkinci) {
                if (each.equals(j)){
                    isimKiyaslama.add(j);
                }

            }

        }
        System.out.println("isimKiyaslama = " + isimKiyaslama);

    }
}
