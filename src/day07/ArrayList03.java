package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList03 {

    //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
    // kalan kismini list olarak bize donduren bir method olusturun

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("ayse", "melih", "fatih", "bbbb"));

        istenmeyenElement(isimler,"a");
    }

    private static void istenmeyenElement(List<String>isimler,String istenmeyen) {

        List<String>yeniIsimler=new ArrayList<>();

        for (int i = 0; i < isimler.size() ; i++) {
            if (!isimler.get(i).contains(istenmeyen)){
                yeniIsimler.add(isimler.get(i));

            }
        }
        System.out.println(yeniIsimler);
    }
}
