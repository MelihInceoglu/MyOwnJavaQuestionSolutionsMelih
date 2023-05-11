package day06;

public class JavaPractice1 {


    //Create an array of 5 floats and calculate their sum.


    public static void main(String[] args) {


        //float [] numbers=new float[5];

        float[] numbers = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        float toplam = 0;

        System.out.println("******************************ForLoop Cozumu*************************");

        for (int i = 0; i < numbers.length; i++) {
            toplam += numbers[i];

        }

        System.out.println("Toplam for loop : " + toplam);

        System.out.println("******************************WhileLoop Cozumu*************************");


        toplam = 0;
        int i = 0;

        while (i < numbers.length) {


            toplam += numbers[i];

            i++;

        }
        System.out.println("Toplam for loop : " + toplam);



        System.out.println("******************************WhileLoop Cozumu2*************************");


        int uzunluk=numbers.length;

        toplam = 0;


        while (uzunluk >0) {

            toplam += numbers[uzunluk-1];

            uzunluk--;

      }

        System.out.println("Toplam while loop 3  : " + toplam);
    }

}
