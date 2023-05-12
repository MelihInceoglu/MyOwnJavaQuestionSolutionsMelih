package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachLoop07 {


    public static void main(String[] args) {


        /*
        Stringlerden olusan bir liste icindeki kelimlerden a harfi iceren kelmeleri yazdirin
         */

        guncelkelimeler();

    }

    public static List<String> guncelkelimeler() {



        List<String> kelimeler=new ArrayList<>(Arrays.asList("ayse","melih","hakkı","mehmet"));
        List<String> yeniKelimeler=new ArrayList<>();

        for (String each:kelimeler) {

            if (each.contains("a")){
                yeniKelimeler.add(each);
            }
        }
        System.out.println("yeniKelimeler = " + yeniKelimeler);


        return yeniKelimeler;
    }
}
