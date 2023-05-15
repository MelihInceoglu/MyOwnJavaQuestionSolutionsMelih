package day09;

import java.util.Arrays;

public class HeySiri {

    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */

    public static void main(String[] args) {

        String str="HeySiri";

        str=str.replaceAll("Hey","Bye");

        System.out.println(str);

        String[]arr=new String[1];
        arr[0]=str;
        System.out.println("arr = " + Arrays.toString(arr));


    }



}
