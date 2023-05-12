package day08;

import java.util.List;
import java.util.Scanner;

public class ForeachLoopKullanici {


    public static void main(String[] args) {

            List<String> kullanidangk=ForEachLoop07.guncelkelimeler();

           String kullanici="";

        Scanner scan=new Scanner(System.in);

        kullanici=scan.next();

        if (kullanici.contains("a")) {

            kullanidangk.add(kullanici);

        }

        System.out.println("kullanidangk = " + kullanidangk);

    }
}
