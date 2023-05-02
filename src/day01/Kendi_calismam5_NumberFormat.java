package day01;

import java.text.NumberFormat;

public class Kendi_calismam5_NumberFormat {

    public static void main(String[] args) {

        NumberFormat currency =NumberFormat.getCurrencyInstance();

       String result= currency.format(1233453.534);

        System.out.println(result);             //₺1.233.453,53 dolar sign

        NumberFormat percent=NumberFormat.getPercentInstance();
        String sonuc=percent.format(0.1);
        System.out.println(sonuc);                  //  %10










    }


}
