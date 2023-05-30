package MapsArrayQuestion;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MenuRestaurantMap {


    //  Soru: Bir restoranın menüsünü temsil etmek için Java'da bir Map kullanarak bir program yazmanız isteniyor.
    //  Menüdeki yemeklerin isimleri String türünde olacak ve fiyatları ise double türünde olacak.
    //  Kullanıcıdan alınan bir yemek ismi üzerinden,
    //  Map'i kullanarak ilgili yemeğin fiyatını ekrana yazdıran bir program yazmanız isteniyor.

    //1. Çorba - 10.0 TL
    //2. Izgara Tavuk - 25.5 TL
    //3. Pizza - 30.0 TL
    //4. Makarna - 15.0 TL
    //
    //Yemek ismi girin: Pizza
    //Seçtiğiniz yemeğin fiyatı: 30.0 TL

    public static void main(String[] args) throws InterruptedException {

        menu();

    }

    public static void menu() throws InterruptedException {

        Map<String, Double> menu = new HashMap<>();
        menu.put("Çorba", 10.0);
        menu.put("Izgara Tavuk", 25.5);
        menu.put("Pizza", 30.0);
        menu.put("Makarna", 15.0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t*************MELIH RESTAURANT********************\n" +
                "\t\t1. Çorba \n" +
                "\t\t2. Izgara Tavuk \n" +
                "\t\t3. Pizza \n" +
                "\t\t4. Makarna ");


        try {

            String secim = scanner.nextLine();

            switch (secim) {

                case "1":
                    System.out.println(menu.get("Çorba") + "TL");

                    System.out.println("Afiyet olsun Başka bir Arzunuz");

                    Thread.sleep(1000);

                    menu();

                    break;
                case "2":

                    System.out.println(menu.get("Izgara Tavuk") + "TL");
                    System.out.println("Afiyet olsun Başka bir Arzunuz");

                    Thread.sleep(1000);

                    menu();

                    break;
                case "3":

                    System.out.println(menu.get("Pizza") + "TL");
                    System.out.println("Afiyet olsun Başka bir Arzunuz");
                    Thread.sleep(1000);
                    menu();

                    break;
                case "4":
                    System.out.println(menu.get("Makarna") + "TL");
                    System.out.println("Afiyet olsun Başka bir Arzunuz");
                    Thread.sleep(1000);
                    menu();

                    break;
                case "q":
                case "Q":
                    System.exit(0);
                    break;

                default:

                    System.out.println("Yanlış Giriş Yaptınız");
                    menu();

            }

        } catch (InputMismatchException e) {

            System.out.println("Hatalı giriş Yaptınız tekrar deneyiniz");

        }
    }


}
