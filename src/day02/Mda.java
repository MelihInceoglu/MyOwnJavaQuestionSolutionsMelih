package day02;

import java.util.Arrays;

public class Mda {


    public static void main(String[] args) {


        int[][] melih={{3,2,1},{2,3,23,4},{7,3,9}};

        System.out.println(melih[1][2]);   //  23

        System.out.println(melih.length); //3

        System.out.println(melih[1].length); //4

        System.out.println(melih[2]);  //[I@1d251891

        System.out.println(Arrays.toString(melih[2])); //  [7,3,9]

        System.out.println(Arrays.deepToString(melih));  //  [[3, 2, 1], [2, 3, 23, 4], [7, 3, 9]]


    }







}
