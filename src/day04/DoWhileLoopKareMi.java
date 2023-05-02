package day04;

import java.util.Scanner;

public class DoWhileLoopKareMi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi= scanner.nextInt();

        boolean kareMi = false;

      int karakok=2;

      do {
          if (sayi==karakok*karakok){
              kareMi=true;
              break;
          }
          karakok++;

      }while(karakok*karakok<=sayi);
        System.out.println(kareMi);

        }
    }






















