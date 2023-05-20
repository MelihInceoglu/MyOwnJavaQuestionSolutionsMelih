package day08;

import java.util.ArrayList;
import java.util.List;

public class ForEachFirstHalfSecondHalf {

    public static void main(String[] args) {


        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //Kelimenin uzunlugu cift sayi ise ilk yarisini
        //Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini yeni bir listeye ekleyip yazdirin.

        //Question 3- Checking each element in a given String array,
        // If the length of the word is an even number, return the first half
        //If the length of the word is odd, add the second half of the word, including the middle letter, to a new list and print it.

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
