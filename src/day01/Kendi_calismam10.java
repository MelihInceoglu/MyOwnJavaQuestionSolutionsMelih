package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Kendi_calismam10 {
    public static void main(String[] args) {

        // verilen string bir array'de
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun

       String [] arr={"AyseNur","Fatma","Hayriye","Mel"};

        enuzunEnkisa(arr);

            }
            public static void enuzunEnkisa(String []arr){

        String enKisa=arr[0];
        String enUzun=arr[0];


                for (int i = 0; i < arr.length ; i++) {

                    if (arr[i].length() > enUzun.length()){ //arr[i lenthi en uzundan büyükse en uzun = arr[i] olur]

                        enUzun = arr[i];

                    }

                if (arr[i].length()<enKisa.length()){



                            enKisa=arr[i];

                        }

                    }
                    System.out.println(enUzun);
                    System.out.println(enKisa);

                }


            }























