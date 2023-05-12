package day08;

import java.util.ArrayList;
import java.util.List;

public class day08ForEach {

    public static void main(String[] args) {


        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //Kelimenin uzunlugu cift sayi ise ilk yarisini
        //Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini yeni bir listeye ekleyip yazdirin.

       String[]arr={"melih","ada","ayse","aysegulcan","mehmet"};

        List<String> yeniArr=new ArrayList<>();

        for (String each:arr) {

            if (each.length()%2==0){
               yeniArr.add(each.substring(0,each.length()/2));

            }else{
                yeniArr.add(each.substring((each.length())/2));
            }
        }

        System.out.println(yeniArr);

    }

}
