package day02;

import java.time.LocalDate;
import java.time.Period;

public class ArraylistlerdeGet {

    public static void main(String[] args) {




        LocalDate now1=LocalDate.now();


        System.out.println(Period.between(now1, LocalDate.of(1994, 07, 10)));


    }




}
