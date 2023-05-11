package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList04 {

    //Soru 4- Verilen pozitif bir n tamsayisini alarak,
    // bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.

    //Puanlar fibonacci serisindeki sayılara göre verilir.
    //1 1 2 3 5 8 13 21 34 .....
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Lütfen bir pozitif tamsayı girin: ");

            int n = scanner.nextInt();

            scanner.close();

            List<Integer> fibonacciListesi = fibonacciListesi(n);


            System.out.println("Fibonacci sayıları :"+fibonacciListesi);

           // for (int fibonacciSayisi : fibonacciListesi) {
           //     System.out.print(fibonacciSayisi + " ");
            //}


            }


    public static List<Integer> fibonacciListesi(int n) {

        List<Integer> fibonacciSayilari = new ArrayList<>();

        int a = 0, b = 1, c = 0;

        while (c < n) {
            fibonacciSayilari.add(c);
            a = b;
            b = c;
            c = a + b;
        }
        return fibonacciSayilari;
    }


    }


