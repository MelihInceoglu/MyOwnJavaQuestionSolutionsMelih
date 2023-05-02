package day02;

public class ForEachLoop {

    public static void main(String[] args) {

        int[]arr={2,5,3,9,4};

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i]+" ");       //2 5 3 9 4
        }
        System.out.println("\n----------------");

        int[]arrIki={2,5,3,9,4};

        for (int each:arrIki
             ) {
            System.out.print(each+" ");     //     2 5 3 9 4
        }









    }
}
